package im.threads.business.preferences;

import android.content.Context;
import android.content.SharedPreferences;
import im.threads.business.preferences.encrypted.EncryptedSharedPreferences;
import im.threads.business.preferences.encrypted.MasterKey;
import java.io.IOException;
import java.security.GeneralSecurityException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Preferences.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/content/SharedPreferences;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Preferences$sharedPreferences$2 extends ej5 implements Function0<SharedPreferences> {
    final /* synthetic */ Preferences this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Preferences$sharedPreferences$2(Preferences preferences) {
        super(0);
        this.this$0 = preferences;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final SharedPreferences invoke() {
        Context context;
        SharedPreferences onGetEncryptedPreferencesException;
        Context context2;
        Context context3;
        Context context4;
        String str;
        try {
            context3 = this.this$0.context;
            MasterKey build = new MasterKey.Builder(context3, MasterKey.DEFAULT_MASTER_KEY_ALIAS).setKeyScheme(MasterKey.KeyScheme.AES256_GCM).build();
            z65.g(build, "Builder(context, MasterK…                 .build()");
            context4 = this.this$0.context;
            str = this.this$0.encryptedStoreName;
            onGetEncryptedPreferencesException = EncryptedSharedPreferences.create(context4, str, build, EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV, EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM);
        } catch (IOException e) {
            Preferences preferences = this.this$0;
            context2 = preferences.context;
            onGetEncryptedPreferencesException = preferences.onGetEncryptedPreferencesException(context2, e);
        } catch (GeneralSecurityException e2) {
            Preferences preferences2 = this.this$0;
            context = preferences2.context;
            onGetEncryptedPreferencesException = preferences2.onGetEncryptedPreferencesException(context, e2);
        }
        z65.g(onGetEncryptedPreferencesException, "try {\n            val ma…ext, exception)\n        }");
        return onGetEncryptedPreferencesException;
    }
}
