package im.threads.business.utils;

import im.threads.R;
import java.util.Locale;
import kotlin.Metadata;
/* compiled from: NetworkErrorUtils.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"KEY_FILE_NOT_FOUND", "", "KEY_FILE_RESTRICTED_SIZE", "KEY_FILE_RESTRICTED_TYPE", "getErrorStringResByCode", "", "code", "threads_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NetworkErrorUtilsKt {
    private static final String KEY_FILE_NOT_FOUND = "file.not-found";
    private static final String KEY_FILE_RESTRICTED_SIZE = "file.restricted.size";
    private static final String KEY_FILE_RESTRICTED_TYPE = "file.restricted.type";

    public static final int getErrorStringResByCode(String str) {
        z65.h(str, "code");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        z65.g(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        int hashCode = lowerCase.hashCode();
        if (hashCode != -1082963434) {
            if (hashCode != 610430274) {
                if (hashCode == 610475131 && lowerCase.equals(KEY_FILE_RESTRICTED_TYPE)) {
                    return R.string.ecc_file_restricted_type_error_during_load_file;
                }
            } else if (lowerCase.equals(KEY_FILE_RESTRICTED_SIZE)) {
                return R.string.ecc_file_restricted_size_error_during_load_file;
            }
        } else if (lowerCase.equals(KEY_FILE_NOT_FOUND)) {
            return R.string.ecc_file_not_found_error_during_load_file;
        }
        return R.string.ecc_some_error_during_load_file;
    }
}
