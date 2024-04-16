package im.threads.business.utils;

import android.content.ClipData;
import android.content.ClipboardManager;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import im.threads.business.preferences.Preferences;
import im.threads.business.preferences.Preferences$save$1;
import im.threads.business.preferences.PreferencesCoreKeys;
import java.lang.reflect.Type;
import kotlin.Metadata;
/* compiled from: ClibpboardExtensions.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0004¨\u0006\u0007²\u0006\n\u0010\b\u001a\u00020\tX\u008a\u0084\u0002²\u0006\n\u0010\b\u001a\u00020\tX\u008a\u0084\u0002"}, d2 = {"copyToBuffer", "", "Landroid/content/ClipboardManager;", "what", "", "isLastCopyText", "", "threads_release", "preferences", "Lim/threads/business/preferences/Preferences;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ClibpboardExtensionsKt {
    public static final void copyToBuffer(ClipboardManager clipboardManager, String str) {
        rn5 b;
        z65.h(clipboardManager, "<this>");
        z65.h(str, "what");
        b = yn5.b(ClibpboardExtensionsKt$copyToBuffer$$inlined$inject$1.INSTANCE);
        clipboardManager.setPrimaryClip(new ClipData("", new String[]{"text/plain"}, new ClipData.Item(str)));
        Preferences copyToBuffer$lambda$0 = copyToBuffer$lambda$0(b);
        String last_copy_text = PreferencesCoreKeys.INSTANCE.getLAST_COPY_TEXT();
        Preferences.Companion.savePreferenceToRam(last_copy_text, str);
        sh0.d(copyToBuffer$lambda$0.getCoroutineScope(), null, null, new Preferences$save$1(copyToBuffer$lambda$0, last_copy_text, str, null), 3, null);
    }

    private static final Preferences copyToBuffer$lambda$0(rn5<? extends Preferences> rn5Var) {
        return rn5Var.getValue();
    }

    public static final boolean isLastCopyText(String str) {
        rn5 b;
        Object obj;
        boolean O;
        boolean O2;
        Object obj2;
        boolean c;
        boolean J;
        boolean u;
        String T0;
        Object U0;
        z65.h(str, "<this>");
        b = yn5.b(ClibpboardExtensionsKt$isLastCopyText$$inlined$inject$1.INSTANCE);
        Preferences isLastCopyText$lambda$1 = isLastCopyText$lambda$1(b);
        String last_copy_text = PreferencesCoreKeys.INSTANCE.getLAST_COPY_TEXT();
        Type type = new TypeToken<String>() { // from class: im.threads.business.utils.ClibpboardExtensionsKt$isLastCopyText$$inlined$get$default$1
        }.getType();
        z65.g(type, "object : TypeToken<T>() {}.type");
        try {
            Preferences.Companion companion = Preferences.Companion;
            String preferenceFromRam = companion.getPreferenceFromRam(last_copy_text);
            int length = preferenceFromRam.length();
            String str2 = preferenceFromRam;
            if (length == 0) {
                str2 = preferenceFromRam;
                if (!companion.isRamPreferencesLoaded()) {
                    String string = isLastCopyText$lambda$1.getSharedPreferences().getString(last_copy_text, null);
                    if (string == null) {
                        string = "";
                    } else {
                        z65.g(string, "sharedPreferences.getString(key, null) ?: \"\"");
                    }
                    String str3 = string;
                    int length2 = str3.length();
                    str2 = str3;
                    if (length2 > 0) {
                        companion.savePreferenceToRam(last_copy_text, str3);
                        str2 = str3;
                    }
                }
            }
            O2 = m0b.O(type.toString(), "String", false, 2, null);
            if (O2) {
                J = l0b.J(str2, "\"", false, 2, null);
                if (J) {
                    u = l0b.u(str2, "\"", false, 2, null);
                    if (u) {
                        T0 = o0b.T0(str2, 1);
                        U0 = o0b.U0(T0, 1);
                        if (U0 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        obj2 = U0;
                    }
                }
                if (str2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                obj2 = str2;
            } else {
                Object l = new Gson().l(str2, type);
                obj2 = l;
                if (l == null) {
                    throw new NullPointerException();
                }
            }
            c = z65.c(obj2, "null");
            obj = obj2;
        } catch (Exception unused) {
        }
        if (c) {
            obj = null;
        }
        String str4 = (String) obj;
        if (str4 != null) {
            O = m0b.O(str, str4, false, 2, null);
            return O;
        }
        return false;
    }

    private static final Preferences isLastCopyText$lambda$1(rn5<? extends Preferences> rn5Var) {
        return rn5Var.getValue();
    }
}
