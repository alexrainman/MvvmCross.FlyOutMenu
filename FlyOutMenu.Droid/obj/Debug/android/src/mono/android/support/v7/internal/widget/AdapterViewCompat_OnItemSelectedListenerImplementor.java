package mono.android.support.v7.internal.widget;


public class AdapterViewCompat_OnItemSelectedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.support.v7.internal.widget.AdapterViewCompat.OnItemSelectedListener
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onItemSelected:(Landroid/support/v7/internal/widget/AdapterViewCompat;Landroid/view/View;IJ)V:GetOnItemSelected_Landroid_support_v7_internal_widget_AdapterViewCompat_Landroid_view_View_IJHandler:Android.Support.V7.Internal.Widget.AdapterViewCompat/IOnItemSelectedListenerInvoker, Xamarin.Android.Support.v7.AppCompat\n" +
			"n_onNothingSelected:(Landroid/support/v7/internal/widget/AdapterViewCompat;)V:GetOnNothingSelected_Landroid_support_v7_internal_widget_AdapterViewCompat_Handler:Android.Support.V7.Internal.Widget.AdapterViewCompat/IOnItemSelectedListenerInvoker, Xamarin.Android.Support.v7.AppCompat\n" +
			"";
		mono.android.Runtime.register ("Android.Support.V7.Internal.Widget.AdapterViewCompat/IOnItemSelectedListenerImplementor, Xamarin.Android.Support.v7.AppCompat, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", AdapterViewCompat_OnItemSelectedListenerImplementor.class, __md_methods);
	}


	public AdapterViewCompat_OnItemSelectedListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == AdapterViewCompat_OnItemSelectedListenerImplementor.class)
			mono.android.TypeManager.Activate ("Android.Support.V7.Internal.Widget.AdapterViewCompat/IOnItemSelectedListenerImplementor, Xamarin.Android.Support.v7.AppCompat, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onItemSelected (android.support.v7.internal.widget.AdapterViewCompat p0, android.view.View p1, int p2, long p3)
	{
		n_onItemSelected (p0, p1, p2, p3);
	}

	private native void n_onItemSelected (android.support.v7.internal.widget.AdapterViewCompat p0, android.view.View p1, int p2, long p3);


	public void onNothingSelected (android.support.v7.internal.widget.AdapterViewCompat p0)
	{
		n_onNothingSelected (p0);
	}

	private native void n_onNothingSelected (android.support.v7.internal.widget.AdapterViewCompat p0);

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
