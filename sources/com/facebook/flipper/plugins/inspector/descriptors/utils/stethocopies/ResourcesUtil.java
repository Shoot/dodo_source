package com.facebook.flipper.plugins.inspector.descriptors.utils.stethocopies;

import android.content.res.Resources;
import android.util.Log;
/* loaded from: classes2.dex */
public class ResourcesUtil {
    private ResourcesUtil() {
    }

    private static String getFallbackIdString(int i) {
        return "#" + Integer.toHexString(i);
    }

    public static String getIdString(Resources resources, int i) throws Resources.NotFoundException {
        String str;
        String str2;
        if (resources == null) {
            return getFallbackIdString(i);
        }
        if (getResourcePackageId(i) != 127) {
            str = resources.getResourcePackageName(i);
            str2 = ":";
        } else {
            str = "";
            str2 = "";
        }
        String resourceTypeName = resources.getResourceTypeName(i);
        String resourceEntryName = resources.getResourceEntryName(i);
        StringBuilder sb = new StringBuilder(str.length() + 1 + str2.length() + resourceTypeName.length() + 1 + resourceEntryName.length());
        sb.append("@");
        sb.append(str);
        sb.append(str2);
        sb.append(resourceTypeName);
        sb.append("/");
        sb.append(resourceEntryName);
        return sb.toString();
    }

    public static String getIdStringQuietly(Object obj, Resources resources, int i) {
        try {
            return getIdString(resources, i);
        } catch (Resources.NotFoundException unused) {
            String fallbackIdString = getFallbackIdString(i);
            String canonicalName = ResourcesUtil.class.getCanonicalName();
            Log.w(canonicalName, "Unknown identifier encountered on " + obj + ": " + fallbackIdString);
            return fallbackIdString;
        }
    }

    private static int getResourcePackageId(int i) {
        return (i >>> 24) & 255;
    }
}
