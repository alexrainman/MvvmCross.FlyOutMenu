
using Cirrious.MvvmCross.ViewModels;

namespace FlyOutMenu.Core.ViewModels
{
	public class RootViewModel  : MvxViewModel
	{
		public RootViewModel()
		{
			Home = new HomeViewModel();
			Menu = new MenuViewModel();
		}
		private HomeViewModel _home;
		public HomeViewModel Home
		{
			get { return _home; }
			set { _home = value; RaisePropertyChanged(() => Home); }
		}

		private MenuViewModel _menu;
		public MenuViewModel Menu
		{
			get { return _menu; }
			set { _menu = value; RaisePropertyChanged(() => Menu); }
		}
	}
}

