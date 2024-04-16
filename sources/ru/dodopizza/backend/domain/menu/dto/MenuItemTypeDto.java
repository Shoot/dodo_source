package ru.dodopizza.backend.domain.menu.dto;

import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MenuItemTypeDto.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/dodopizza/backend/domain/menu/dto/MenuItemTypeDto;", "", "(Ljava/lang/String;I)V", "SIMPLE", "PIZZA", "HALVES", "COMBO_TEMPLATE", "VARIABLE", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MenuItemTypeDto {
    private static final /* synthetic */ kj3 $ENTRIES;
    private static final /* synthetic */ MenuItemTypeDto[] $VALUES;
    @uca(alternate = {"3"}, value = "1")
    public static final MenuItemTypeDto SIMPLE = new MenuItemTypeDto("SIMPLE", 0);
    @uca("2")
    public static final MenuItemTypeDto PIZZA = new MenuItemTypeDto("PIZZA", 1);
    @uca("4")
    public static final MenuItemTypeDto HALVES = new MenuItemTypeDto("HALVES", 2);
    @uca("5")
    public static final MenuItemTypeDto COMBO_TEMPLATE = new MenuItemTypeDto("COMBO_TEMPLATE", 3);
    @uca("6")
    public static final MenuItemTypeDto VARIABLE = new MenuItemTypeDto("VARIABLE", 4);

    private static final /* synthetic */ MenuItemTypeDto[] $values() {
        return new MenuItemTypeDto[]{SIMPLE, PIZZA, HALVES, COMBO_TEMPLATE, VARIABLE};
    }

    static {
        MenuItemTypeDto[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lj3.a($values);
    }

    private MenuItemTypeDto(String str, int i) {
    }

    public static kj3<MenuItemTypeDto> getEntries() {
        return $ENTRIES;
    }

    public static MenuItemTypeDto valueOf(String str) {
        return (MenuItemTypeDto) Enum.valueOf(MenuItemTypeDto.class, str);
    }

    public static MenuItemTypeDto[] values() {
        return (MenuItemTypeDto[]) $VALUES.clone();
    }
}
