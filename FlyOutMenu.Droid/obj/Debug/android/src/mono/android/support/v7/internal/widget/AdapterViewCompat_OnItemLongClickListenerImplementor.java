package mono.android.support.v7.internal.widget;


public class AdapterViewCompat_OnItemLongClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.support.v7.internal.widget.AdapterViewCompat.OnItemLongClickListener
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onItemLongClick:(Landroid/support/v7/internal/widget/AdapterViewCompat;Landroid/view/View;IJ)Z:GetOnItemLongClick_Landroid_support_v7_internal_widget_AdapterViewCompat_Landroid_view_View_IJHandler:Android.Support.V7.Internal.Widget.AdapterViewCompat/IOnItemLongClickListenerInvoker, Xamarin.Android.Support.v7.AppCompat\n" +
			"";
		mono.android.Runtime.register ("Android.Support.V7.Internal.Widget.AdapterViewCompat/IOnItemLongClickListenerImplementor, Xamarin.Android.Support.v7.AppCompat, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", AdapterViewCompat_OnItemLongClickListenerImplementor.class, __md_methods);
	}


	public AdapterViewCompat_OnItemLongClickListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == AdapterViewCompat_OnItemLongClickListenerImplementor.class)
			mono.android.TypeManager.Activate ("Android.Support.V7.Internal.Widget.AdapterViewCompat/IOnItemLongClickListenerImplementor, Xamarin.Android.Support.v7.AppCompat, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public boolean onItemLongClick (android.support.v7.internal.widget.AdapterViewCompat p0, android.view.View p1, int p2, long p3)
	{
		return n_onItemLongClick (p0, p1, p2, p3);
	}

	private native boolean n_onItemLongClick (android.support.v7.internal.widget.AdapterViewCompat p0, android.view.View p1, int p2, long p3);

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
