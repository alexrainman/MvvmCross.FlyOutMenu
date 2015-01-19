package mono.android.support.v7.internal.widget;


public class NativeActionModeAwareLayout_OnActionModeForChildListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.support.v7.internal.widget.NativeActionModeAwareLayout.OnActionModeForChildListener
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_startActionModeForChild:(Landroid/view/View;Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode;:GetStartActionModeForChild_Landroid_view_View_Landroid_view_ActionMode_Callback_Handler:Android.Support.V7.Internal.Widget.NativeActionModeAwareLayout/IOnActionModeForChildListenerInvoker, Xamarin.Android.Support.v7.AppCompat\n" +
			"";
		mono.android.Runtime.register ("Android.Support.V7.Internal.Widget.NativeActionModeAwareLayout/IOnActionModeForChildListenerImplementor, Xamarin.Android.Support.v7.AppCompat, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", NativeActionModeAwareLayout_OnActionModeForChildListenerImplementor.class, __md_methods);
	}


	public NativeActionModeAwareLayout_OnActionModeForChildListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == NativeActionModeAwareLayout_OnActionModeForChildListenerImplementor.class)
			mono.android.TypeManager.Activate ("Android.Support.V7.Internal.Widget.NativeActionModeAwareLayout/IOnActionModeForChildListenerImplementor, Xamarin.Android.Support.v7.AppCompat, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public android.view.ActionMode startActionModeForChild (android.view.View p0, android.view.ActionMode.Callback p1)
	{
		return n_startActionModeForChild (p0, p1);
	}

	private native android.view.ActionMode n_startActionModeForChild (android.view.View p0, android.view.ActionMode.Callback p1);

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
