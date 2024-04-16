package defpackage;

import kotlin.Metadata;
import ru.dodopizza.backend.domain.stories.dto.InfoStoryDto;
/* compiled from: InfoStory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000¨\u0006\u0003"}, d2 = {"Lru/dodopizza/backend/domain/stories/dto/InfoStoryDto;", "Lb15;", "a", "base_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: c15  reason: default package */
/* loaded from: classes4.dex */
public final class c15 {
    public static final b15 a(InfoStoryDto infoStoryDto) {
        String str;
        String str2;
        String str3 = null;
        if (infoStoryDto != null) {
            str = infoStoryDto.getMenu();
        } else {
            str = null;
        }
        String str4 = "";
        if (str == null) {
            str = "";
        }
        if (infoStoryDto != null) {
            str2 = infoStoryDto.getProfile();
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "";
        }
        if (infoStoryDto != null) {
            str3 = infoStoryDto.getCart();
        }
        if (str3 != null) {
            str4 = str3;
        }
        return new b15(str, str2, str4);
    }
}
