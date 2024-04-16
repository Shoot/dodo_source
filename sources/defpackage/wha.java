package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.crypto.tink.shaded.protobuf.o;
import java.io.CharConversionException;
import java.io.FileNotFoundException;
import java.io.IOException;
/* compiled from: SharedPrefKeysetReader.java */
/* renamed from: wha  reason: default package */
/* loaded from: classes2.dex */
public final class wha implements ug5 {
    private final SharedPreferences a;
    private final String b;

    public wha(Context context, String str, String str2) throws IOException {
        if (str != null) {
            this.b = str;
            Context applicationContext = context.getApplicationContext();
            if (str2 == null) {
                this.a = PreferenceManager.getDefaultSharedPreferences(applicationContext);
                return;
            } else {
                this.a = applicationContext.getSharedPreferences(str2, 0);
                return;
            }
        }
        throw new IllegalArgumentException("keysetName cannot be null");
    }

    private byte[] b() throws IOException {
        try {
            String string = this.a.getString(this.b, null);
            if (string != null) {
                return go4.a(string);
            }
            throw new FileNotFoundException(String.format("can't read keyset; the pref value %s does not exist", this.b));
        } catch (ClassCastException | IllegalArgumentException unused) {
            throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", this.b));
        }
    }

    @Override // defpackage.ug5
    public jh3 a() throws IOException {
        return jh3.Q(b(), o.b());
    }

    @Override // defpackage.ug5
    public qg5 read() throws IOException {
        return qg5.V(b(), o.b());
    }
}
