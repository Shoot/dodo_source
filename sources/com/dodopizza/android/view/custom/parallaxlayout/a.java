package com.dodopizza.android.view.custom.parallaxlayout;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.view.WindowManager;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.android.view.custom.parallaxlayout.ParallaxLayerLayout;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SensorTranslationUpdater.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000b\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0001\rB\u0011\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b+\u0010,B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b+\u0010-J\u001a\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\fH\u0016J\u0012\u0010\u000f\u001a\u00020\f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0006\u0010\u0015\u001a\u00020\fR\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019R\u0014\u0010\u001f\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010*\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006/"}, d2 = {"Lcom/dodopizza/android/view/custom/parallaxlayout/a;", "Lcom/dodopizza/android/view/custom/parallaxlayout/ParallaxLayerLayout$c;", "Landroid/hardware/SensorEventListener;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/hardware/SensorEvent;", "event", "", DateTokenConverter.CONVERTER_KEY, c.a, "Lcom/dodopizza/android/view/custom/parallaxlayout/ParallaxLayerLayout;", "parallaxLayerLayout", "", "a", "b", "onSensorChanged", "Landroid/hardware/Sensor;", "sensor", "", "accuracy", "onAccuracyChanged", e.a, "Landroid/hardware/SensorManager;", "Landroid/hardware/SensorManager;", "sensorManager", "[F", "tiltVector", "targetMatrix", "rotationMatrix", "orientedRotationMatrix", "f", "truncatedRotationVector", "", "g", "Z", "targeted", "", Image.TYPE_HIGH, "F", "tiltSensitivity", "i", "Lcom/dodopizza/android/view/custom/parallaxlayout/ParallaxLayerLayout;", "parallaxLayout", "<init>", "(Landroid/hardware/SensorManager;)V", "(Landroid/content/Context;)V", "j", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class a implements ParallaxLayerLayout.c, SensorEventListener {
    public static final C0111a j = new C0111a(null);
    private final SensorManager a;
    private final float[] b;
    private final float[] c;
    private final float[] d;
    private final float[] e;
    private final float[] f;
    private boolean g;
    private float h;
    private ParallaxLayerLayout i;

    /* compiled from: SensorTranslationUpdater.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/dodopizza/android/view/custom/parallaxlayout/a$a;", "", "", "DEFAULT_SAMPLING_PERIOD", "I", "MATRIX_SIZE", "ROTATION_VECTOR_SIZE", "TILT_VECTOR_SIZE", "<init>", "()V", "android_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.dodopizza.android.view.custom.parallaxlayout.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0111a {
        private C0111a() {
        }

        public /* synthetic */ C0111a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public a(SensorManager sensorManager) {
        this.a = sensorManager;
        this.b = new float[3];
        this.c = new float[16];
        this.d = new float[16];
        this.e = new float[16];
        this.f = new float[4];
        this.h = 2.0f;
    }

    private final float[] c(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr.length > 4) {
            System.arraycopy(fArr, 0, this.f, 0, 4);
            return this.f;
        }
        z65.e(fArr);
        return fArr;
    }

    private final float[] d(Context context, SensorEvent sensorEvent) {
        float[] c = c(sensorEvent);
        if (!this.g) {
            SensorManager.getRotationMatrixFromVector(this.c, c);
            this.g = true;
            return null;
        }
        SensorManager.getRotationMatrixFromVector(this.d, c);
        Object systemService = context.getSystemService("window");
        z65.f(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        int rotation = ((WindowManager) systemService).getDefaultDisplay().getRotation();
        if (rotation == 0) {
            SensorManager.getAngleChange(this.b, this.d, this.c);
        } else {
            if (rotation != 1) {
                if (rotation != 2) {
                    if (rotation == 3) {
                        SensorManager.remapCoordinateSystem(this.d, 130, 1, this.e);
                    }
                } else {
                    SensorManager.remapCoordinateSystem(this.d, 129, 130, this.e);
                }
            } else {
                SensorManager.remapCoordinateSystem(this.d, 2, 129, this.e);
            }
            SensorManager.getAngleChange(this.b, this.e, this.c);
        }
        int length = this.b.length;
        for (int i = 0; i < length; i++) {
            float[] fArr = this.b;
            float f = fArr[i] / 3.1415927f;
            fArr[i] = f;
            float f2 = f * this.h;
            fArr[i] = f2;
            if (f2 > 1.0f) {
                fArr[i] = 1.0f;
            } else if (f2 < -1.0f) {
                fArr[i] = -1.0f;
            }
        }
        return this.b;
    }

    @Override // com.dodopizza.android.view.custom.parallaxlayout.ParallaxLayerLayout.c
    public void a(ParallaxLayerLayout parallaxLayerLayout) {
        z65.h(parallaxLayerLayout, "parallaxLayerLayout");
        this.i = parallaxLayerLayout;
    }

    @Override // com.dodopizza.android.view.custom.parallaxlayout.ParallaxLayerLayout.c
    public void b() {
        this.i = null;
    }

    public final void e() {
        Sensor defaultSensor;
        SensorManager sensorManager = this.a;
        if (sensorManager != null && (defaultSensor = sensorManager.getDefaultSensor(11)) != null) {
            this.a.registerListener(this, defaultSensor, 100);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
        z65.h(sensor, "sensor");
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        ParallaxLayerLayout parallaxLayerLayout;
        if (sensorEvent == null || (parallaxLayerLayout = this.i) == null) {
            return;
        }
        Context context = parallaxLayerLayout.getContext();
        z65.g(context, "getContext(...)");
        float[] d = d(context, sensorEvent);
        if (d == null) {
            return;
        }
        parallaxLayerLayout.e(new float[]{d[2], -d[1]});
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(android.content.Context r2) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            defpackage.z65.h(r2, r0)
            java.lang.String r0 = "sensor"
            java.lang.Object r2 = r2.getSystemService(r0)
            java.lang.String r0 = "null cannot be cast to non-null type android.hardware.SensorManager"
            defpackage.z65.f(r2, r0)
            android.hardware.SensorManager r2 = (android.hardware.SensorManager) r2
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dodopizza.android.view.custom.parallaxlayout.a.<init>(android.content.Context):void");
    }
}
