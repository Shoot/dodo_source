package org.threeten.bp.format;

import org.threeten.bp.DateTimeException;
/* loaded from: classes3.dex */
public class DateTimeParseException extends DateTimeException {
    private final String a;
    private final int b;

    public DateTimeParseException(String str, CharSequence charSequence, int i) {
        super(str);
        this.a = charSequence.toString();
        this.b = i;
    }

    public DateTimeParseException(String str, CharSequence charSequence, int i, Throwable th) {
        super(str, th);
        this.a = charSequence.toString();
        this.b = i;
    }
}
