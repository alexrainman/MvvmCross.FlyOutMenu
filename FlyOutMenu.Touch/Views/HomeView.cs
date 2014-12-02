
using Cirrious.MvvmCross.Touch.Views;
using MonoTouch.UIKit;

namespace FlyOutMenu.Touch
{
	public partial class HomeView : MvxViewController
	{
		public HomeView () : base ("HomeView", null)
		{
		}

		public override void DidReceiveMemoryWarning ()
		{
			// Releases the view if it doesn't have a superview.
			base.DidReceiveMemoryWarning ();
			
			// Release any cached data, images, etc that aren't in use.
		}

		public override void ViewDidLoad ()
		{
			base.ViewDidLoad ();
			
			// Perform any additional setup after loading the view, typically from a nib.

			Title = "FlyOutMenu.Touch";

			AppDelegate app = UIApplication.SharedApplication.Delegate as AppDelegate;

			NavigationItem.SetLeftBarButtonItem(
				new UIBarButtonItem(UIImage.FromBundle("threelines")
					, UIBarButtonItemStyle.Plain
					, (sender, args) => app.SidebarController.ToggleMenu ()), true);
		}
	}
}

