
using Android.OS;
using Cirrious.MvvmCross.Droid.FullFragging.Fragments;
using Android.Views;

namespace FlyOutMenu.Droid
{
	public class MenuView : MvxFragment
	{
		public static MenuView NewInstance()
		{
			var frag = new MenuView { Arguments = new Bundle() };
			return frag;
		}

		public override View OnCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
		{
			return inflater.Inflate(Resource.Layout.MenuView, null);
		}
	}
}

