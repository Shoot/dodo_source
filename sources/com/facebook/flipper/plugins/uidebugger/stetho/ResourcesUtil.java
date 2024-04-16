package com.facebook.flipper.plugins.uidebugger.stetho;

import android.content.res.Resources;
import kotlin.Metadata;
/* compiled from: ResourcesUtil.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0018\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0006J\"\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00012\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0002¨\u0006\u000e"}, d2 = {"Lcom/facebook/flipper/plugins/uidebugger/stetho/ResourcesUtil;", "", "()V", "getFallbackIdString", "", "resourceId", "", "getIdString", "r", "Landroid/content/res/Resources;", "getIdStringQuietly", "idContext", "getResourcePackageId", "id", "android_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ResourcesUtil {
    public static final ResourcesUtil INSTANCE = new ResourcesUtil();

    private ResourcesUtil() {
    }

    private final String getFallbackIdString(int i) {
        return z65.q("#", Integer.toHexString(i));
    }

    private final int getResourcePackageId(int i) {
        return (i >>> 24) & 255;
    }

    public final String getIdString(Resources resources, int i) throws Resources.NotFoundException {
        String resourcePackageName;
        String str;
        if (resources == null) {
            return getFallbackIdString(i);
        }
        if (getResourcePackageId(i) == 127) {
            resourcePackageName = "";
            str = "";
        } else {
            resourcePackageName = resources.getResourcePackageName(i);
            z65.g(resourcePackageName, "r.getResourcePackageName(resourceId)");
            str = ":";
        }
        String resourceTypeName = resources.getResourceTypeName(i);
        String resourceEntryName = resources.getResourceEntryName(i);
        StringBuilder sb = new StringBuilder(resourcePackageName.length() + 1 + str.length() + resourceTypeName.length() + 1 + resourceEntryName.length());
        sb.append("@");
        sb.append(resourcePackageName);
        sb.append(str);
        sb.append(resourceTypeName);
        sb.append("/");
        sb.append(resourceEntryName);
        String sb2 = sb.toString();
        z65.g(sb2, "sb.toString()");
        return sb2;
    }

    public final String getIdStringQuietly(Object obj, Resources resources, int i) {
        z65.h(obj, "idContext");
        try {
            return getIdString(resources, i);
        } catch (Resources.NotFoundException unused) {
            return getFallbackIdString(i);
        }
    }
}
