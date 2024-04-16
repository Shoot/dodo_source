package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.json.JSONObject;
/* compiled from: CachedSettingsIo.java */
/* renamed from: zl0  reason: default package */
/* loaded from: classes2.dex */
public class zl0 {
    private final File a;

    public zl0(hu3 hu3Var) {
        this.a = hu3Var.e("com.crashlytics.settings.json");
    }

    private File a() {
        return this.a;
    }

    public JSONObject b() {
        Throwable th;
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        rx5.f().b("Checking for cached settings...");
        FileInputStream fileInputStream2 = null;
        try {
            try {
                File a = a();
                if (a.exists()) {
                    fileInputStream = new FileInputStream(a);
                    try {
                        jSONObject = new JSONObject(ek1.A(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e) {
                        e = e;
                        rx5.f().e("Failed to fetch cached settings", e);
                        ek1.f(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } else {
                    rx5.f().i("Settings file does not exist.");
                    jSONObject = null;
                }
                ek1.f(fileInputStream2, "Error while closing settings cache file.");
                return jSONObject;
            } catch (Throwable th2) {
                th = th2;
                ek1.f(null, "Error while closing settings cache file.");
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            ek1.f(null, "Error while closing settings cache file.");
            throw th;
        }
    }

    public void c(long j, JSONObject jSONObject) {
        FileWriter fileWriter;
        rx5.f().i("Writing settings to cache file...");
        if (jSONObject != null) {
            FileWriter fileWriter2 = null;
            try {
                try {
                    jSONObject.put("expires_at", j);
                    fileWriter = new FileWriter(a());
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Exception e) {
                e = e;
            }
            try {
                fileWriter.write(jSONObject.toString());
                fileWriter.flush();
                ek1.f(fileWriter, "Failed to close settings writer.");
            } catch (Exception e2) {
                e = e2;
                fileWriter2 = fileWriter;
                rx5.f().e("Failed to cache settings", e);
                ek1.f(fileWriter2, "Failed to close settings writer.");
            } catch (Throwable th2) {
                th = th2;
                fileWriter2 = fileWriter;
                ek1.f(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
        }
    }
}
