
using UIKit;
using SidebarNavigation;
using Cirrious.MvvmCross.Touch.Views;
using FlyOutMenu.Core.ViewModels;
using Cirrious.MvvmCross.ViewModels;

namespace FlyOutMenu.Touch
{
	public sealed partial class RootView : MvxViewController
	{
		public RootView () : base ("RootView", null)
		{
			ViewDidLoad();
		}

		public override void DidReceiveMemoryWarning ()
		{
			// Releases the view if it doesn't have a superview.
			base.DidReceiveMemoryWarning ();
			
			// Release any cached data, images, etc that aren't in use.
		}

		public RootViewModel RootViewModel
		{ get { return base.ViewModel as RootViewModel; } }

		public override void ViewDidLoad ()
		{
			base.ViewDidLoad ();
			
			// Perform any additional setup after loading the view, typically from a nib.

			if (ViewModel == null)
				return;

			AppDelegate app = UIApplication.SharedApplication.Delegate as AppDelegate;

			// create a slideout navigation controller with the top navigation controller and the menu view controller
			app.SidebarController = new SidebarController(this, CreateViewFor(RootViewModel.Home, false), CreateViewFor(RootViewModel.Menu, true));
			app.SidebarController.MenuWidth = 220;
			app.SidebarController.ReopenOnRotate = false;
			app.SidebarController.MenuLocation = SidebarController.MenuLocations.Left;
		}

		// from Stuart Lodge N+1-25
		private UIViewController CreateViewFor(IMvxViewModel viewModel, bool navBarHidden)
		{
			var controller = new UINavigationController();
			var screen = this.CreateViewControllerFor(viewModel) as UIViewController;
			controller.PushViewController(screen, false);
			controller.NavigationBarHidden = navBarHidden;
			return controller;
		}
	}
}

