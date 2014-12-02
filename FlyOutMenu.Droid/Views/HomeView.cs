
using Android.OS;
using Cirrious.MvvmCross.Droid.FullFragging.Fragments;
using Android.Views;
using Android.App;

namespace FlyOutMenu.Droid
{
	public class HomeView : MvxFragment
	{
		Activity ctx;

		public override void OnAttach (Activity activity)
		{
			ctx = activity;
			base.OnAttach (activity);
		}

		public static HomeView NewInstance()
		{
			var frag = new HomeView { Arguments = new Bundle() };
			return frag;
		}

		public override View OnCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
		{
			var result = inflater.Inflate(Resource.Layout.HomeView, null);

			return result;
		}
			
	}
}

