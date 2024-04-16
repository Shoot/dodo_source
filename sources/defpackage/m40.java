package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
/* compiled from: AutofillType.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b'\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'¨\u0006("}, d2 = {"Lm40;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", c.a, DateTokenConverter.CONVERTER_KEY, e.a, "f", "g", Image.TYPE_HIGH, "i", "j", "k", "l", Image.TYPE_MEDIUM, "n", "o", "p", "q", "r", Image.TYPE_SMALL, "t", "u", "v", "w", "x", "y", "z", "A", "B", "I", "X", "Y", "Z", "S4", "T4", "U4", "V4", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: m40  reason: default package */
/* loaded from: classes.dex */
public enum m40 {
    EmailAddress,
    Username,
    Password,
    NewUsername,
    NewPassword,
    PostalAddress,
    PostalCode,
    CreditCardNumber,
    CreditCardSecurityCode,
    CreditCardExpirationDate,
    CreditCardExpirationMonth,
    CreditCardExpirationYear,
    CreditCardExpirationDay,
    AddressCountry,
    AddressRegion,
    AddressLocality,
    AddressStreet,
    AddressAuxiliaryDetails,
    PostalCodeExtended,
    PersonFullName,
    PersonFirstName,
    PersonLastName,
    PersonMiddleName,
    PersonMiddleInitial,
    PersonNamePrefix,
    PersonNameSuffix,
    PhoneNumber,
    PhoneNumberDevice,
    PhoneCountryCode,
    PhoneNumberNational,
    Gender,
    BirthDateFull,
    BirthDateDay,
    BirthDateMonth,
    BirthDateYear,
    SmsOtpCode
}
