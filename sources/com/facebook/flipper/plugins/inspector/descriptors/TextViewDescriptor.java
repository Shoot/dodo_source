package com.facebook.flipper.plugins.inspector.descriptors;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.TextView;
import com.facebook.flipper.core.FlipperObject;
import com.facebook.flipper.core.FlipperValue;
import com.facebook.flipper.plugins.inspector.InspectorValue;
import com.facebook.flipper.plugins.inspector.Named;
import com.facebook.flipper.plugins.inspector.NodeDescriptor;
import com.facebook.flipper.plugins.inspector.Touch;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class TextViewDescriptor extends NodeDescriptor<TextView> {
    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public Object getAXChildAt(TextView textView, int i) {
        return null;
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public Object getChildAt(TextView textView, int i) {
        return null;
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public int getChildCount(TextView textView) {
        return 0;
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public void axHitTest(TextView textView, Touch touch) throws Exception {
        descriptorForClass(View.class).axHitTest(textView, touch);
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public List<Named<String>> getAXAttributes(TextView textView) throws Exception {
        return descriptorForClass(View.class).getAXAttributes(textView);
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public List<Named<FlipperObject>> getAXData(TextView textView) throws Exception {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(descriptorForClass(View.class).getAXData(textView));
        return arrayList;
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public String getAXDecoration(TextView textView) throws Exception {
        return descriptorForClass(View.class).getAXDecoration(textView);
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public String getAXName(TextView textView) throws Exception {
        return descriptorForClass(View.class).getAXName(textView);
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public List<Named<String>> getAttributes(TextView textView) throws Exception {
        return descriptorForClass(View.class).getAttributes(textView);
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public List<Named<FlipperObject>> getData(TextView textView) throws Exception {
        ArrayList arrayList = new ArrayList();
        NodeDescriptor<?> descriptorForClass = descriptorForClass(View.class);
        arrayList.add(0, new Named("TextView", new FlipperObject.Builder().put("text", (FlipperValue) InspectorValue.mutable(InspectorValue.Type.Text, textView.getText().toString())).put("textColor", (FlipperValue) InspectorValue.mutable(InspectorValue.Type.Color, Integer.valueOf(textView.getTextColors().getDefaultColor()))).put("textSize", (FlipperValue) InspectorValue.mutable(InspectorValue.Type.Number, Float.valueOf(textView.getTextSize()))).build()));
        arrayList.addAll(descriptorForClass.getData(textView));
        return arrayList;
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public String getDecoration(TextView textView) throws Exception {
        return descriptorForClass(View.class).getDecoration(textView);
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public FlipperObject getExtraInfo(TextView textView) {
        return descriptorForClass(View.class).getExtraInfo(textView);
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public String getId(TextView textView) throws Exception {
        return descriptorForClass(View.class).getId(textView);
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public String getName(TextView textView) throws Exception {
        return descriptorForClass(View.class).getName(textView);
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public Bitmap getSnapshot(TextView textView, boolean z) throws Exception {
        return descriptorForClass(View.class).getSnapshot(textView, z);
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public void hitTest(TextView textView, Touch touch) throws Exception {
        descriptorForClass(View.class).hitTest(textView, touch);
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public void init(TextView textView) throws Exception {
        descriptorForClass(View.class).init(textView);
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public boolean matches(String str, TextView textView) throws Exception {
        return descriptorForClass(Object.class).matches(str, textView);
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public void setHighlighted(TextView textView, boolean z, boolean z2) throws Exception {
        descriptorForClass(View.class).setHighlighted(textView, z, z2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
        if (r5.equals("textColor") == false) goto L9;
     */
    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setValue(android.widget.TextView r4, java.lang.String[] r5, com.facebook.flipper.plugins.inspector.SetDataOperations.FlipperValueHint r6, com.facebook.flipper.core.FlipperDynamic r7) throws java.lang.Exception {
        /*
            r3 = this;
            r0 = 0
            r1 = r5[r0]
            r1.hashCode()
            java.lang.String r2 = "TextView"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L18
            java.lang.Class<android.view.View> r0 = android.view.View.class
            com.facebook.flipper.plugins.inspector.NodeDescriptor r0 = r3.descriptorForClass(r0)
            r0.setValue(r4, r5, r6, r7)
            goto L63
        L18:
            r6 = 1
            r5 = r5[r6]
            r5.hashCode()
            int r1 = r5.hashCode()
            r2 = -1
            switch(r1) {
                case -1063571914: goto L3e;
                case -1003668786: goto L33;
                case 3556653: goto L28;
                default: goto L26;
            }
        L26:
            r0 = -1
            goto L47
        L28:
            java.lang.String r6 = "text"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L31
            goto L26
        L31:
            r0 = 2
            goto L47
        L33:
            java.lang.String r0 = "textSize"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L3c
            goto L26
        L3c:
            r0 = 1
            goto L47
        L3e:
            java.lang.String r6 = "textColor"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L47
            goto L26
        L47:
            switch(r0) {
                case 0: goto L5c;
                case 1: goto L53;
                case 2: goto L4b;
                default: goto L4a;
            }
        L4a:
            goto L63
        L4b:
            java.lang.String r5 = r7.asString()
            r4.setText(r5)
            goto L63
        L53:
            int r5 = r7.asInt()
            float r5 = (float) r5
            r4.setTextSize(r5)
            goto L63
        L5c:
            int r5 = r7.asInt()
            r4.setTextColor(r5)
        L63:
            r3.invalidate(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.flipper.plugins.inspector.descriptors.TextViewDescriptor.setValue(android.widget.TextView, java.lang.String[], com.facebook.flipper.plugins.inspector.SetDataOperations$FlipperValueHint, com.facebook.flipper.core.FlipperDynamic):void");
    }
}
