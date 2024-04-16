package com.dodopizza.kustoworker.session;

import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import com.dodopizza.kustoworker.CommonUtils;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SessionData.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0086\b\u0018\u0000 !2\u00020\u0001:\u0001!B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006\""}, d2 = {"Lcom/dodopizza/kustoworker/session/DeviceData;", "", "arch", "", "availableProcessors", "", "diskSpace", "", "isEmulator", "", "manufacturer", "model", "(Ljava/lang/String;IJZLjava/lang/String;Ljava/lang/String;)V", "getArch", "()Ljava/lang/String;", "getAvailableProcessors", "()I", "getDiskSpace", "()J", "()Z", "getManufacturer", "getModel", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "Companion", "kusto-worker_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes2.dex */
public final class DeviceData {
    public static final Companion Companion = new Companion(null);
    private final String arch;
    private final int availableProcessors;
    private final long diskSpace;
    private final boolean isEmulator;
    private final String manufacturer;
    private final String model;

    /* compiled from: SessionData.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/dodopizza/kustoworker/session/DeviceData$Companion;", "", "()V", "create", "Lcom/dodopizza/kustoworker/session/DeviceData;", "kusto-worker_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final DeviceData create() {
            File dataDirectory = Environment.getDataDirectory();
            z65.g(dataDirectory, "Environment.getDataDirectory()");
            StatFs statFs = new StatFs(dataDirectory.getPath());
            long blockCountLong = statFs.getBlockCountLong() * statFs.getBlockCountLong();
            int availableProcessors = Runtime.getRuntime().availableProcessors();
            CommonUtils commonUtils = CommonUtils.INSTANCE;
            String cpuArchitecture = commonUtils.getCpuArchitecture();
            boolean isEmulator = commonUtils.isEmulator();
            String str = Build.MANUFACTURER;
            z65.g(str, "Build.MANUFACTURER");
            String str2 = Build.PRODUCT;
            z65.g(str2, "Build.PRODUCT");
            return new DeviceData(cpuArchitecture, availableProcessors, blockCountLong, isEmulator, str, str2);
        }
    }

    public DeviceData(String str, int i, long j, boolean z, String str2, String str3) {
        z65.h(str, "arch");
        z65.h(str2, "manufacturer");
        z65.h(str3, "model");
        this.arch = str;
        this.availableProcessors = i;
        this.diskSpace = j;
        this.isEmulator = z;
        this.manufacturer = str2;
        this.model = str3;
    }

    public static /* synthetic */ DeviceData copy$default(DeviceData deviceData, String str, int i, long j, boolean z, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = deviceData.arch;
        }
        if ((i2 & 2) != 0) {
            i = deviceData.availableProcessors;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            j = deviceData.diskSpace;
        }
        long j2 = j;
        if ((i2 & 8) != 0) {
            z = deviceData.isEmulator;
        }
        boolean z2 = z;
        if ((i2 & 16) != 0) {
            str2 = deviceData.manufacturer;
        }
        String str4 = str2;
        if ((i2 & 32) != 0) {
            str3 = deviceData.model;
        }
        return deviceData.copy(str, i3, j2, z2, str4, str3);
    }

    public final String component1() {
        return this.arch;
    }

    public final int component2() {
        return this.availableProcessors;
    }

    public final long component3() {
        return this.diskSpace;
    }

    public final boolean component4() {
        return this.isEmulator;
    }

    public final String component5() {
        return this.manufacturer;
    }

    public final String component6() {
        return this.model;
    }

    public final DeviceData copy(String str, int i, long j, boolean z, String str2, String str3) {
        z65.h(str, "arch");
        z65.h(str2, "manufacturer");
        z65.h(str3, "model");
        return new DeviceData(str, i, j, z, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DeviceData) {
                DeviceData deviceData = (DeviceData) obj;
                if (!z65.c(this.arch, deviceData.arch) || this.availableProcessors != deviceData.availableProcessors || this.diskSpace != deviceData.diskSpace || this.isEmulator != deviceData.isEmulator || !z65.c(this.manufacturer, deviceData.manufacturer) || !z65.c(this.model, deviceData.model)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final String getArch() {
        return this.arch;
    }

    public final int getAvailableProcessors() {
        return this.availableProcessors;
    }

    public final long getDiskSpace() {
        return this.diskSpace;
    }

    public final String getManufacturer() {
        return this.manufacturer;
    }

    public final String getModel() {
        return this.model;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int i;
        int i2;
        String str = this.arch;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int a = ((((i * 31) + this.availableProcessors) * 31) + ax1.a(this.diskSpace)) * 31;
        boolean z = this.isEmulator;
        int i4 = z;
        if (z != 0) {
            i4 = 1;
        }
        int i5 = (a + i4) * 31;
        String str2 = this.manufacturer;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        String str3 = this.model;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return i6 + i3;
    }

    public final boolean isEmulator() {
        return this.isEmulator;
    }

    public String toString() {
        return "DeviceData(arch=" + this.arch + ", availableProcessors=" + this.availableProcessors + ", diskSpace=" + this.diskSpace + ", isEmulator=" + this.isEmulator + ", manufacturer=" + this.manufacturer + ", model=" + this.model + ")";
    }
}
