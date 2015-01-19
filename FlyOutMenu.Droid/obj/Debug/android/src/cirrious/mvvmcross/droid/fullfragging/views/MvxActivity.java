package cirrious.mvvmcross.droid.fullfragging.views;


public abstract class MvxActivity
	extends cirrious.crosscore.droid.views.MvxEventSourceActivity
	implements
		mono.android.IGCUserPeer
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_setContentView:(I)V:GetSetContentView_IHandler\n" +
			"n_onAttachFragment:(Landroid/app/Fragment;)V:GetOnAttachFragment_Landroid_app_Fragment_Handler\n" +
			"";
		mono.android.Runtime.register ("Cirrious.MvvmCross.Droid.FullFragging.Views.MvxActivity, Cirrious.MvvmCross.Droid.FullFragging, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", MvxActivity.class, __md_methods);
	}


	public MvxActivity () throws java.lang.Throwable
	{
		super ();
		if (getClass () == MvxActivity.class)
			mono.android.TypeManager.Activate ("Cirrious.MvvmCross.Droid.FullFragging.Views.MvxActivity, Cirrious.MvvmCross.Droid.FullFragging, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void setContentView (int p0)
	{
		n_setContentView (p0);
	}

	private native void n_setContentView (int p0);


	public void onAttachFragment (android.app.Fragment p0)
	{
		n_onAttachFragment (p0);
	}

	private native void n_onAttachFragment (android.app.Fragment p0);

	java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
