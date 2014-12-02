package slidingmenusharp.app;


public class SlidingPrefereceActivity
	extends android.preference.PreferenceActivity
	implements
		mono.android.IGCUserPeer
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n" +
			"n_onPostCreate:(Landroid/os/Bundle;)V:GetOnPostCreate_Landroid_os_Bundle_Handler\n" +
			"n_findViewById:(I)Landroid/view/View;:GetFindViewById_IHandler\n" +
			"n_onSaveInstanceState:(Landroid/os/Bundle;)V:GetOnSaveInstanceState_Landroid_os_Bundle_Handler\n" +
			"n_setContentView:(I)V:GetSetContentView_IHandler\n" +
			"n_setContentView:(Landroid/view/View;)V:GetSetContentView_Landroid_view_View_Handler\n" +
			"n_setContentView:(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V:GetSetContentView_Landroid_view_View_Landroid_view_ViewGroup_LayoutParams_Handler\n" +
			"n_onKeyUp:(ILandroid/view/KeyEvent;)Z:GetOnKeyUp_ILandroid_view_KeyEvent_Handler\n" +
			"";
		mono.android.Runtime.register ("SlidingMenuSharp.App.SlidingPrefereceActivity, SlidingMenuSharp, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", SlidingPrefereceActivity.class, __md_methods);
	}


	public SlidingPrefereceActivity () throws java.lang.Throwable
	{
		super ();
		if (getClass () == SlidingPrefereceActivity.class)
			mono.android.TypeManager.Activate ("SlidingMenuSharp.App.SlidingPrefereceActivity, SlidingMenuSharp, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onCreate (android.os.Bundle p0)
	{
		n_onCreate (p0);
	}

	private native void n_onCreate (android.os.Bundle p0);


	public void onPostCreate (android.os.Bundle p0)
	{
		n_onPostCreate (p0);
	}

	private native void n_onPostCreate (android.os.Bundle p0);


	public android.view.View findViewById (int p0)
	{
		return n_findViewById (p0);
	}

	private native android.view.View n_findViewById (int p0);


	public void onSaveInstanceState (android.os.Bundle p0)
	{
		n_onSaveInstanceState (p0);
	}

	private native void n_onSaveInstanceState (android.os.Bundle p0);


	public void setContentView (int p0)
	{
		n_setContentView (p0);
	}

	private native void n_setContentView (int p0);


	public void setContentView (android.view.View p0)
	{
		n_setContentView (p0);
	}

	private native void n_setContentView (android.view.View p0);


	public void setContentView (android.view.View p0, android.view.ViewGroup.LayoutParams p1)
	{
		n_setContentView (p0, p1);
	}

	private native void n_setContentView (android.view.View p0, android.view.ViewGroup.LayoutParams p1);


	public boolean onKeyUp (int p0, android.view.KeyEvent p1)
	{
		return n_onKeyUp (p0, p1);
	}

	private native boolean n_onKeyUp (int p0, android.view.KeyEvent p1);

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
