package moxy;
/* loaded from: classes3.dex */
public interface OnDestroyListener {
    public static final OnDestroyListener EMPTY = new OnDestroyListener() { // from class: x77
        @Override // moxy.OnDestroyListener
        public final void onDestroy() {
            y77.a();
        }
    };

    void onDestroy();
}
