package defpackage;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StringNumberConversionsJVM.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcx9;", "", "Lec9;", "b", "Lec9;", "value", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* renamed from: cx9  reason: default package */
/* loaded from: classes3.dex */
public final class cx9 {
    public static final cx9 a = new cx9();
    public static final ec9 b;

    static {
        String str = "[eE][+-]?(\\p{Digit}+)";
        b = new ec9("[\\x00-\\x20]*[+-]?(NaN|Infinity|((" + (CoreConstants.LEFT_PARENTHESIS_CHAR + "(\\p{Digit}+)(\\.)?((\\p{Digit}+)?)(" + str + ")?)|(\\.((\\p{Digit}+))(" + str + ")?)|((" + ("(0[xX](\\p{XDigit}+)(\\.)?)|(0[xX](\\p{XDigit}+)?(\\.)(\\p{XDigit}+)" + CoreConstants.RIGHT_PARENTHESIS_CHAR) + ")[pP][+-]?(\\p{Digit}+)" + CoreConstants.RIGHT_PARENTHESIS_CHAR) + ")[fFdD]?))[\\x00-\\x20]*");
    }

    private cx9() {
    }
}
