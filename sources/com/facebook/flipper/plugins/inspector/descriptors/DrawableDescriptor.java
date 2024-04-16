package com.facebook.flipper.plugins.inspector.descriptors;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.flipper.core.FlipperObject;
import com.facebook.flipper.core.FlipperValue;
import com.facebook.flipper.plugins.inspector.HighlightedOverlay;
import com.facebook.flipper.plugins.inspector.InspectorValue;
import com.facebook.flipper.plugins.inspector.Named;
import com.facebook.flipper.plugins.inspector.NodeDescriptor;
import com.facebook.flipper.plugins.inspector.Touch;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public class DrawableDescriptor extends NodeDescriptor<Drawable> {
    private static boolean hasAlphaSupport() {
        return true;
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public Object getChildAt(Drawable drawable, int i) {
        return null;
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public int getChildCount(Drawable drawable) {
        return 0;
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public String getDecoration(Drawable drawable) {
        return null;
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public void init(Drawable drawable) {
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public List<Named<String>> getAttributes(Drawable drawable) {
        return Collections.EMPTY_LIST;
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public List<Named<FlipperObject>> getData(Drawable drawable) {
        FlipperObject.Builder builder = new FlipperObject.Builder();
        Rect bounds = drawable.getBounds();
        builder.put(ElementGenerator.TEXT_ALIGN_LEFT, (FlipperValue) InspectorValue.mutable(Integer.valueOf(bounds.left)));
        builder.put("top", (FlipperValue) InspectorValue.mutable(Integer.valueOf(bounds.top)));
        builder.put(ElementGenerator.TEXT_ALIGN_RIGHT, (FlipperValue) InspectorValue.mutable(Integer.valueOf(bounds.right)));
        builder.put("bottom", (FlipperValue) InspectorValue.mutable(Integer.valueOf(bounds.bottom)));
        if (hasAlphaSupport()) {
            builder.put("alpha", (FlipperValue) InspectorValue.mutable(Integer.valueOf(drawable.getAlpha())));
        }
        return Arrays.asList(new Named("Drawable", builder.build()));
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public String getId(Drawable drawable) {
        return Integer.toString(System.identityHashCode(drawable));
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public String getName(Drawable drawable) {
        return drawable.getClass().getSimpleName();
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public Bitmap getSnapshot(Drawable drawable, boolean z) throws Exception {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                return bitmapDrawable.getBitmap();
            }
        }
        if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        drawable.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public void hitTest(Drawable drawable, Touch touch) {
        touch.finish();
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public boolean matches(String str, Drawable drawable) throws Exception {
        return descriptorForClass(Object.class).matches(str, drawable);
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public void setHighlighted(Drawable drawable, boolean z, boolean z2) {
        Drawable.Callback callback = drawable.getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        if (callback instanceof View) {
            View view = (View) callback;
            if (z) {
                Rect rect = new Rect();
                HighlightedOverlay.setHighlighted(view, rect, rect, drawable.getBounds(), z2);
                return;
            }
            HighlightedOverlay.removeHighlight(view);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
        if (r6.equals("bottom") == false) goto L5;
     */
    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setValue(android.graphics.drawable.Drawable r5, java.lang.String[] r6, com.facebook.flipper.plugins.inspector.SetDataOperations.FlipperValueHint r7, com.facebook.flipper.core.FlipperDynamic r8) {
        /*
            r4 = this;
            android.graphics.Rect r7 = r5.getBounds()
            r0 = 0
            r1 = r6[r0]
            r1.hashCode()
            java.lang.String r2 = "Drawable"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L14
            goto L8c
        L14:
            r1 = 1
            r6 = r6[r1]
            r6.hashCode()
            int r2 = r6.hashCode()
            r3 = -1
            switch(r2) {
                case -1383228885: goto L50;
                case 115029: goto L45;
                case 3317767: goto L3a;
                case 92909918: goto L2f;
                case 108511772: goto L24;
                default: goto L22;
            }
        L22:
            r0 = -1
            goto L59
        L24:
            java.lang.String r0 = "right"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L2d
            goto L22
        L2d:
            r0 = 4
            goto L59
        L2f:
            java.lang.String r0 = "alpha"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L38
            goto L22
        L38:
            r0 = 3
            goto L59
        L3a:
            java.lang.String r0 = "left"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L43
            goto L22
        L43:
            r0 = 2
            goto L59
        L45:
            java.lang.String r0 = "top"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L4e
            goto L22
        L4e:
            r0 = 1
            goto L59
        L50:
            java.lang.String r1 = "bottom"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L59
            goto L22
        L59:
            switch(r0) {
                case 0: goto L83;
                case 1: goto L79;
                case 2: goto L6f;
                case 3: goto L67;
                case 4: goto L5d;
                default: goto L5c;
            }
        L5c:
            goto L8c
        L5d:
            int r6 = r8.asInt()
            r7.right = r6
            r5.setBounds(r7)
            goto L8c
        L67:
            int r6 = r8.asInt()
            r5.setAlpha(r6)
            goto L8c
        L6f:
            int r6 = r8.asInt()
            r7.left = r6
            r5.setBounds(r7)
            goto L8c
        L79:
            int r6 = r8.asInt()
            r7.top = r6
            r5.setBounds(r7)
            goto L8c
        L83:
            int r6 = r8.asInt()
            r7.bottom = r6
            r5.setBounds(r7)
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.flipper.plugins.inspector.descriptors.DrawableDescriptor.setValue(android.graphics.drawable.Drawable, java.lang.String[], com.facebook.flipper.plugins.inspector.SetDataOperations$FlipperValueHint, com.facebook.flipper.core.FlipperDynamic):void");
    }
}
