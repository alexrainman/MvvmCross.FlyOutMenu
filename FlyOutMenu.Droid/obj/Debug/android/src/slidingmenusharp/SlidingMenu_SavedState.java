package slidingmenusharp;


public class SlidingMenu_SavedState
	extends android.view.View.BaseSavedState
	implements
		mono.android.IGCUserPeer
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_writeToParcel:(Landroid/os/Parcel;I)V:GetWriteToParcel_Landroid_os_Parcel_IHandler\n" +
			"n_InitializeCreator:()Lslidingmenusharp/SlidingMenu_SavedState_SavedStateCreator;:__export__\n" +
			"";
		mono.android.Runtime.register ("SlidingMenuSharp.SlidingMenu/SavedState, SlidingMenuSharp, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", SlidingMenu_SavedState.class, __md_methods);
	}


	public SlidingMenu_SavedState (android.os.Parcel p0) throws java.lang.Throwable
	{
		super (p0);
		if (getClass () == SlidingMenu_SavedState.class)
			mono.android.TypeManager.Activate ("SlidingMenuSharp.SlidingMenu/SavedState, SlidingMenuSharp, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.OS.Parcel, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0 });
	}


	public SlidingMenu_SavedState (android.os.Parcelable p0) throws java.lang.Throwable
	{
		super (p0);
		if (getClass () == SlidingMenu_SavedState.class)
			mono.android.TypeManager.Activate ("SlidingMenuSharp.SlidingMenu/SavedState, SlidingMenuSharp, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.OS.IParcelable, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0 });
	}


	private static slidingmenusharp.SlidingMenu_SavedState_SavedStateCreator CREATOR = InitializeCreator ();


	public void writeToParcel (android.os.Parcel p0, int p1)
	{
		n_writeToParcel (p0, p1);
	}

	private native void n_writeToParcel (android.os.Parcel p0, int p1);

	private static slidingmenusharp.SlidingMenu_SavedState_SavedStateCreator InitializeCreator ()
	{
		return n_InitializeCreator ();
	}

	private static native slidingmenusharp.SlidingMenu_SavedState_SavedStateCreator n_InitializeCreator ();

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
