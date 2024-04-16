package defpackage;

import android.widget.ListView;
import androidx.annotation.NonNull;
/* compiled from: ListViewAutoScrollHelper.java */
/* renamed from: ir5  reason: default package */
/* loaded from: classes.dex */
public class ir5 extends b10 {
    private final ListView s;

    public ir5(@NonNull ListView listView) {
        super(listView);
        this.s = listView;
    }

    @Override // defpackage.b10
    public boolean a(int i) {
        return false;
    }

    @Override // defpackage.b10
    public boolean b(int i) {
        ListView listView = this.s;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i2 = firstVisiblePosition + childCount;
        if (i > 0) {
            if (i2 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else if (i >= 0) {
            return false;
        } else {
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.b10
    public void j(int i, int i2) {
        jr5.b(this.s, i2);
    }
}
