package defpackage;

import java.text.StringCharacterIterator;
import kotlin.Metadata;
/* compiled from: LuhnValidator.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lm36;", "Lyvb;", "", "string", "", "a", "<init>", "()V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: m36  reason: default package */
/* loaded from: classes4.dex */
public final class m36 implements yvb {
    @Override // defpackage.yvb
    public boolean a(String str) {
        z65.h(str, "string");
        int[][] iArr = {new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, new int[]{0, 2, 4, 6, 8, 1, 3, 5, 7, 9}};
        StringCharacterIterator stringCharacterIterator = new StringCharacterIterator(str);
        char last = stringCharacterIterator.last();
        int i = 0;
        int i2 = 0;
        while (last != 65535) {
            if (!Character.isDigit(last)) {
                return false;
            }
            i += iArr[i2 & 1][last - '0'];
            last = stringCharacterIterator.previous();
            i2++;
        }
        if (i % 10 != 0) {
            return false;
        }
        return true;
    }
}
