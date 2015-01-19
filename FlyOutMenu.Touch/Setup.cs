using UIKit;
using Cirrious.CrossCore.Platform;
using Cirrious.MvvmCross.ViewModels;
using Cirrious.MvvmCross.Touch.Platform;
using Cirrious.MvvmCross.Touch.Views.Presenters;

namespace FlyOutMenu.Touch
{
	public class Setup : MvxTouchSetup
	{
		private MvxApplicationDelegate _applicationDelegate;
		private UIWindow _window;

		public Setup(MvxApplicationDelegate applicationDelegate, UIWindow window)
            : base(applicationDelegate, window)
		{
			_applicationDelegate = applicationDelegate;
			_window = window;
		}

		protected override IMvxApplication CreateApp ()
		{
			return new Core.App();
		}
		
        protected override IMvxTrace CreateDebugTrace()
        {
            return new DebugTrace();
        }

		protected override IMvxTouchViewPresenter CreatePresenter()
		{
			return new MyPresenter(_applicationDelegate, _window);
		}
	}

	// use presenter to hide rootview nav bar
	public class MyPresenter : MvxTouchViewPresenter
	{
		public MyPresenter(UIApplicationDelegate applicationDelegate, UIWindow window)
			: base(applicationDelegate, window)
		{
		}

		protected override UINavigationController CreateNavigationController(UIViewController viewController)
		{
			var navBar = base.CreateNavigationController(viewController);
			navBar.NavigationBarHidden = true;
			return navBar;
		}
	}
}