package cirrious.mvvmcross.droid.fullfragging.fragments;


public abstract class MvxFragment
	extends cirrious.mvvmcross.droid.fullfragging.fragments.eventsource.MvxEventSourceFragment
	implements
		mono.android.IGCUserPeer
{
	static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Cirrious.MvvmCross.Droid.FullFragging.Fragments.MvxFragment, Cirrious.MvvmCross.Droid.FullFragging, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", MvxFragment.class, __md_methods);
	}


	public MvxFragment () throws java.lang.Throwable
	{
		super ();
		if (getClass () == MvxFragment.class)
			mono.android.TypeManager.Activate ("Cirrious.MvvmCross.Droid.FullFragging.Fragments.MvxFragment, Cirrious.MvvmCross.Droid.FullFragging, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
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
