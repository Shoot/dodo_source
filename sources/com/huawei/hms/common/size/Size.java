package com.huawei.hms.common.size;

import com.huawei.hms.common.internal.Objects;
import org.slf4j.Marker;
/* loaded from: classes3.dex */
public class Size {
    private final int height;
    private final int width;

    public Size(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    public static Size parseSize(String str) {
        try {
            int indexOf = str.indexOf("x");
            if (indexOf < 0) {
                indexOf = str.indexOf(Marker.ANY_MARKER);
            }
            return new Size(Integer.parseInt(str.substring(0, indexOf)), Integer.parseInt(str.substring(indexOf + 1)));
        } catch (Exception unused) {
            throw new IllegalArgumentException("Size parses failed");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Size)) {
            return false;
        }
        Size size = (Size) obj;
        if (this.width != size.width || this.height != size.height) {
            return false;
        }
        return true;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(getWidth()), Integer.valueOf(getHeight()));
    }

    public final String toString() {
        int i = this.width;
        int i2 = this.height;
        return "Width is " + i + " Height is " + i2;
    }
}
