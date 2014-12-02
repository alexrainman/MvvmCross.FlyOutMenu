
using Cirrious.MvvmCross.Touch.Views;

namespace FlyOutMenu.Touch
{
	public sealed partial class MenuView : MvxViewController
	{
		public MenuView () : base ("MenuView", null)
		{
			ViewDidLoad ();
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
		}
	}
}

