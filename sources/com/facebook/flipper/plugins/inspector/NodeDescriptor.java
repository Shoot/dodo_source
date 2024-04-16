package com.facebook.flipper.plugins.inspector;

import android.graphics.Bitmap;
import com.facebook.flipper.core.ErrorReportingRunnable;
import com.facebook.flipper.core.FlipperArray;
import com.facebook.flipper.core.FlipperConnection;
import com.facebook.flipper.core.FlipperDynamic;
import com.facebook.flipper.core.FlipperObject;
import com.facebook.flipper.plugins.inspector.SetDataOperations;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public abstract class NodeDescriptor<T> {
    protected FlipperConnection mConnection;
    private DescriptorMapping mDescriptorMapping;

    public void axHitTest(T t, Touch touch) throws Exception {
        touch.finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean connected() {
        if (this.mConnection != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final NodeDescriptor<?> descriptorForClass(Class<?> cls) {
        DescriptorMapping descriptorMapping = this.mDescriptorMapping;
        if (descriptorMapping != null) {
            return descriptorMapping.descriptorForClass(cls);
        }
        return null;
    }

    public List<Named<String>> getAXAttributes(T t) throws Exception {
        return Collections.EMPTY_LIST;
    }

    public Object getAXChildAt(T t, int i) throws Exception {
        return getChildAt(t, i);
    }

    public int getAXChildCount(T t) throws Exception {
        return getChildCount(t);
    }

    public List<Named<FlipperObject>> getAXData(T t) throws Exception {
        return Collections.EMPTY_LIST;
    }

    public String getAXDecoration(T t) throws Exception {
        return null;
    }

    public String getAXName(T t) throws Exception {
        return "";
    }

    public abstract List<Named<String>> getAttributes(T t) throws Exception;

    public abstract Object getChildAt(T t, int i) throws Exception;

    public abstract int getChildCount(T t) throws Exception;

    public abstract List<Named<FlipperObject>> getData(T t) throws Exception;

    public abstract String getDecoration(T t) throws Exception;

    public FlipperObject getExtraInfo(T t) {
        return new FlipperObject.Builder().build();
    }

    public abstract String getId(T t) throws Exception;

    public abstract String getName(T t) throws Exception;

    public abstract Bitmap getSnapshot(T t, boolean z) throws Exception;

    public abstract void hitTest(T t, Touch touch) throws Exception;

    public abstract void init(T t) throws Exception;

    public void invalidate(final T t) {
        FlipperConnection flipperConnection = this.mConnection;
        if (flipperConnection != null) {
            new ErrorReportingRunnable(flipperConnection) { // from class: com.facebook.flipper.plugins.inspector.NodeDescriptor.1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.facebook.flipper.core.ErrorReportingRunnable
                protected void runOrThrow() throws Exception {
                    NodeDescriptor.this.mConnection.send("invalidate", new FlipperObject.Builder().put("nodes", new FlipperArray.Builder().put(new FlipperObject.Builder().put("id", NodeDescriptor.this.getId(t)).build()).build()).build());
                }
            }.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void invalidateAX(final T t) {
        FlipperConnection flipperConnection = this.mConnection;
        if (flipperConnection != null) {
            new ErrorReportingRunnable(flipperConnection) { // from class: com.facebook.flipper.plugins.inspector.NodeDescriptor.2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.facebook.flipper.core.ErrorReportingRunnable
                protected void runOrThrow() throws Exception {
                    NodeDescriptor.this.mConnection.send("invalidateAX", new FlipperObject.Builder().put("nodes", new FlipperArray.Builder().put(new FlipperObject.Builder().put("id", NodeDescriptor.this.getId(t)).build()).build()).build());
                }
            }.run();
        }
    }

    public abstract boolean matches(String str, T t) throws Exception;

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setConnection(FlipperConnection flipperConnection) {
        this.mConnection = flipperConnection;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setDescriptorMapping(DescriptorMapping descriptorMapping) {
        this.mDescriptorMapping = descriptorMapping;
    }

    public abstract void setHighlighted(T t, boolean z, boolean z2) throws Exception;

    public abstract void setValue(T t, String[] strArr, SetDataOperations.FlipperValueHint flipperValueHint, FlipperDynamic flipperDynamic) throws Exception;
}
