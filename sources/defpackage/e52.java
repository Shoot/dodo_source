package defpackage;

import kotlin.Metadata;
import ru.dodopizza.backend.domain.customer.dto.CustomerDto;
/* compiled from: CustomerConvertion.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0005"}, d2 = {"Lru/dodopizza/backend/domain/customer/dto/CustomerDto;", "Lh48;", "phoneParser", "Ln42;", "a", "base_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: e52  reason: default package */
/* loaded from: classes4.dex */
public final class e52 {
    public static final n42 a(CustomerDto customerDto, h48 h48Var) {
        String str;
        String str2;
        String str3;
        z65.h(customerDto, "<this>");
        z65.h(h48Var, "phoneParser");
        String uuid = customerDto.getUuid();
        f28 a = h48Var.a(customerDto.getPhoneNumber());
        String firstName = customerDto.getFirstName();
        if (firstName == null) {
            str = "";
        } else {
            str = firstName;
        }
        String lastName = customerDto.getLastName();
        if (lastName == null) {
            str2 = "";
        } else {
            str2 = lastName;
        }
        Integer birthDay = customerDto.getBirthDay();
        Integer birthMonth = customerDto.getBirthMonth();
        Integer birthYear = customerDto.getBirthYear();
        double doubleValue = ((Number) mh5.c(customerDto.getLoyaltyProgramBalance(), Double.valueOf(0.0d))).doubleValue();
        String email = customerDto.getEmail();
        if (email == null) {
            str3 = "";
        } else {
            str3 = email;
        }
        return new n42(uuid, a, str, str2, birthDay, birthMonth, birthYear, ((Number) mh5.c(customerDto.getOrderHistoryCount(), 0)).intValue(), doubleValue, str3, customerDto.getSubscribedToSms());
    }
}
