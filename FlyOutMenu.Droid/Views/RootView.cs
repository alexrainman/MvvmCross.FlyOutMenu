
using Android.App;
using Android.OS;
using FlyOutMenu.Core.ViewModels;
using Cirrious.MvvmCross.Droid.FullFragging.Fragments;
using Cirrious.MvvmCross.ViewModels;
using SlidingMenuSharp;
using Android.Views;

namespace FlyOutMenu.Droid
{
	[Activity (Label = "FlyOutMenu.Droid", MainLauncher = false, Theme = "@style/Theme.AppCompat.Light")]		
	public class RootView : MvxSlidingActionBarActivity
	{
		public RootViewModel RootViewModel
		{ get { return base.ViewModel as RootViewModel; } }

		protected override void OnCreate (Bundle bundle)
		{
			base.OnCreate (bundle);

			// Create your application here
			SetContentView (Resource.Layout.RootView);

			CreateViewFor (HomeView.NewInstance(), RootViewModel.Home, Resource.Id.content_frame);

			SetBehindContentView(Resource.Layout.menu_frame);

			SlidingMenu.ShadowWidthRes = Resource.Dimension.shadow_width;
			SlidingMenu.BehindOffsetRes = Resource.Dimension.slidingmenu_offset;
			SlidingMenu.ShadowDrawableRes = Resource.Drawable.shadow;
			SlidingMenu.FadeDegree = 0.25f;
			SlidingMenu.TouchModeAbove = TouchMode.Fullscreen; //TouchMode.Margin;

			CreateViewFor (MenuView.NewInstance(), RootViewModel.Menu, Resource.Id.menu_frame);

			SupportActionBar.SetDisplayHomeAsUpEnabled(true);
			SupportActionBar.SetHomeAsUpIndicator (Resource.Drawable.ic_menu_grey600_36dp);
			SupportActionBar.SetHomeButtonEnabled(true);

		}

		public void CreateViewFor(MvxFragment fragment, IMvxViewModel viewModel, int container){
	
			fragment.ViewModel = viewModel;

			FragmentManager.BeginTransaction ()
				.Replace (container, fragment)
				.Commit ();
		}

		public override bool OnOptionsItemSelected(IMenuItem item)
		{
			switch (item.ItemId)
			{
			case Android.Resource.Id.Home:
				Toggle();
				return true;
			}
			return base.OnOptionsItemSelected(item);
		}
	}
}

