package cirrious.mvvmcross.droid.fullfragging.fragments;


public abstract class MvxDialogFragment_1
	extends cirrious.mvvmcross.droid.fullfragging.fragments.MvxDialogFragment
	implements
		mono.android.IGCUserPeer
{
	static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Cirrious.MvvmCross.Droid.FullFragging.Fragments.MvxDialogFragment`1, Cirrious.MvvmCross.Droid.FullFragging, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", MvxDialogFragment_1.class, __md_methods);
	}


	public MvxDialogFragment_1 () throws java.lang.Throwable
	{
		super ();
		if (getClass () == MvxDialogFragment_1.class)
			mono.android.TypeManager.Activate ("Cirrious.MvvmCross.Droid.FullFragging.Fragments.MvxDialogFragment`1, Cirrious.MvvmCross.Droid.FullFragging, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}

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
