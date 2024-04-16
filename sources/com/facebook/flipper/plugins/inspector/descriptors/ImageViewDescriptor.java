package com.facebook.flipper.plugins.inspector.descriptors;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.facebook.flipper.core.FlipperDynamic;
import com.facebook.flipper.core.FlipperObject;
import com.facebook.flipper.core.FlipperValue;
import com.facebook.flipper.plugins.inspector.Named;
import com.facebook.flipper.plugins.inspector.NodeDescriptor;
import com.facebook.flipper.plugins.inspector.SetDataOperations;
import com.facebook.flipper.plugins.inspector.Touch;
import com.facebook.flipper.plugins.inspector.descriptors.utils.EnumMapping;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class ImageViewDescriptor extends NodeDescriptor<ImageView> {
    private static final EnumMapping<ImageView.ScaleType> sScaleTypeMapping = new EnumMapping<ImageView.ScaleType>("CENTER") { // from class: com.facebook.flipper.plugins.inspector.descriptors.ImageViewDescriptor.1
        {
            put("CENTER", ImageView.ScaleType.CENTER);
            put("CENTER_CROP", ImageView.ScaleType.CENTER_CROP);
            put("CENTER_INSIDE", ImageView.ScaleType.CENTER_INSIDE);
            put("FIT_CENTER", ImageView.ScaleType.FIT_CENTER);
            put("FIT_END", ImageView.ScaleType.FIT_END);
            put("FIT_START", ImageView.ScaleType.FIT_START);
            put("FIT_XY", ImageView.ScaleType.FIT_XY);
            put("MATRIX", ImageView.ScaleType.MATRIX);
        }
    };

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public Object getAXChildAt(ImageView imageView, int i) {
        return null;
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public Object getChildAt(ImageView imageView, int i) {
        return null;
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public int getChildCount(ImageView imageView) {
        return 0;
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public void axHitTest(ImageView imageView, Touch touch) throws Exception {
        descriptorForClass(View.class).axHitTest(imageView, touch);
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public List<Named<String>> getAXAttributes(ImageView imageView) throws Exception {
        return descriptorForClass(View.class).getAXAttributes(imageView);
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public List<Named<FlipperObject>> getAXData(ImageView imageView) throws Exception {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(descriptorForClass(View.class).getAXData(imageView));
        return arrayList;
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public String getAXDecoration(ImageView imageView) throws Exception {
        return descriptorForClass(View.class).getAXDecoration(imageView);
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public String getAXName(ImageView imageView) throws Exception {
        return descriptorForClass(View.class).getAXName(imageView);
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public List<Named<String>> getAttributes(ImageView imageView) throws Exception {
        return descriptorForClass(View.class).getAttributes(imageView);
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public List<Named<FlipperObject>> getData(ImageView imageView) throws Exception {
        ArrayList arrayList = new ArrayList();
        NodeDescriptor<?> descriptorForClass = descriptorForClass(View.class);
        arrayList.add(0, new Named("ImageView", new FlipperObject.Builder().put("scaleType", (FlipperValue) sScaleTypeMapping.toPicker((EnumMapping<ImageView.ScaleType>) imageView.getScaleType())).build()));
        arrayList.addAll(descriptorForClass.getData(imageView));
        return arrayList;
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public String getDecoration(ImageView imageView) throws Exception {
        return descriptorForClass(View.class).getDecoration(imageView);
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public FlipperObject getExtraInfo(ImageView imageView) {
        return descriptorForClass(View.class).getExtraInfo(imageView);
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public String getId(ImageView imageView) throws Exception {
        return descriptorForClass(View.class).getId(imageView);
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public String getName(ImageView imageView) throws Exception {
        return descriptorForClass(View.class).getName(imageView);
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public Bitmap getSnapshot(ImageView imageView, boolean z) throws Exception {
        return descriptorForClass(View.class).getSnapshot(imageView, z);
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public void hitTest(ImageView imageView, Touch touch) throws Exception {
        descriptorForClass(View.class).hitTest(imageView, touch);
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public void init(ImageView imageView) throws Exception {
        descriptorForClass(View.class).init(imageView);
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public boolean matches(String str, ImageView imageView) throws Exception {
        return descriptorForClass(Object.class).matches(str, imageView);
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public void setHighlighted(ImageView imageView, boolean z, boolean z2) throws Exception {
        descriptorForClass(View.class).setHighlighted(imageView, z, z2);
    }

    @Override // com.facebook.flipper.plugins.inspector.NodeDescriptor
    public void setValue(ImageView imageView, String[] strArr, SetDataOperations.FlipperValueHint flipperValueHint, FlipperDynamic flipperDynamic) throws Exception {
        String str = strArr[0];
        str.hashCode();
        if (!str.equals("ImageView")) {
            descriptorForClass(View.class).setValue(imageView, strArr, flipperValueHint, flipperDynamic);
        } else {
            String str2 = strArr[1];
            str2.hashCode();
            if (str2.equals("scaleType")) {
                imageView.setScaleType(sScaleTypeMapping.get(flipperDynamic.asString()));
            }
        }
        invalidate(imageView);
    }
}
