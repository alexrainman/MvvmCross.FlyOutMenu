package slidingmenusharp;


public class SlidingMenu_SavedState_SavedStateCreator
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.os.Parcelable.Creator
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_createFromParcel:(Landroid/os/Parcel;)Ljava/lang/Object;:GetCreateFromParcel_Landroid_os_Parcel_Handler:Android.OS.IParcelableCreatorInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_newArray:(I)[Ljava/lang/Object;:GetNewArray_IHandler:Android.OS.IParcelableCreatorInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("SlidingMenuSharp.SlidingMenu/SavedState/SavedStateCreator, SlidingMenuSharp, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", SlidingMenu_SavedState_SavedStateCreator.class, __md_methods);
	}


	public SlidingMenu_SavedState_SavedStateCreator () throws java.lang.Throwable
	{
		super ();
		if (getClass () == SlidingMenu_SavedState_SavedStateCreator.class)
			mono.android.TypeManager.Activate ("SlidingMenuSharp.SlidingMenu/SavedState/SavedStateCreator, SlidingMenuSharp, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public java.lang.Object createFromParcel (android.os.Parcel p0)
	{
		return n_createFromParcel (p0);
	}

	private native java.lang.Object n_createFromParcel (android.os.Parcel p0);


	public java.lang.Object[] newArray (int p0)
	{
		return n_newArray (p0);
	}

	private native java.lang.Object[] n_newArray (int p0);

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
