package ru.dodopizza.mindbox.dto;

import kotlin.Metadata;
/* compiled from: UserRequestDto.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lru/dodopizza/mindbox/dto/UserRequestDto;", "Lwa7;", "Lru/dodopizza/mindbox/dto/CustomerDto;", "customerDto", "Lru/dodopizza/mindbox/dto/CustomerDto;", "getCustomerDto", "()Lru/dodopizza/mindbox/dto/CustomerDto;", "<init>", "(Lru/dodopizza/mindbox/dto/CustomerDto;)V", "mindbox_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class UserRequestDto extends wa7 {
    @uca("customer")
    private final CustomerDto customerDto;

    public UserRequestDto(CustomerDto customerDto) {
        z65.h(customerDto, "customerDto");
        this.customerDto = customerDto;
    }

    public final CustomerDto getCustomerDto() {
        return this.customerDto;
    }
}
