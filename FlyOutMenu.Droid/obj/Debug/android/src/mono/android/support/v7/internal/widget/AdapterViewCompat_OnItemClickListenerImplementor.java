package mono.android.support.v7.internal.widget;


public class AdapterViewCompat_OnItemClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.support.v7.internal.widget.AdapterViewCompat.OnItemClickListener
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onItemClick:(Landroid/support/v7/internal/widget/AdapterViewCompat;Landroid/view/View;IJ)V:GetOnItemClick_Landroid_support_v7_internal_widget_AdapterViewCompat_Landroid_view_View_IJHandler:Android.Support.V7.Internal.Widget.AdapterViewCompat/IOnItemClickListenerInvoker, Xamarin.Android.Support.v7.AppCompat\n" +
			"";
		mono.android.Runtime.register ("Android.Support.V7.Internal.Widget.AdapterViewCompat/IOnItemClickListenerImplementor, Xamarin.Android.Support.v7.AppCompat, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", AdapterViewCompat_OnItemClickListenerImplementor.class, __md_methods);
	}


	public AdapterViewCompat_OnItemClickListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == AdapterViewCompat_OnItemClickListenerImplementor.class)
			mono.android.TypeManager.Activate ("Android.Support.V7.Internal.Widget.AdapterViewCompat/IOnItemClickListenerImplementor, Xamarin.Android.Support.v7.AppCompat, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onItemClick (android.support.v7.internal.widget.AdapterViewCompat p0, android.view.View p1, int p2, long p3)
	{
		n_onItemClick (p0, p1, p2, p3);
	}

	private native void n_onItemClick (android.support.v7.internal.widget.AdapterViewCompat p0, android.view.View p1, int p2, long p3);

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
