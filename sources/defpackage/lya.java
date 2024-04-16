package defpackage;

import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.huawei.hms.opendevice.c;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import ru.dodopizza.backend.domain.stories.StoriesApi;
import ru.dodopizza.backend.domain.stories.dto.StoriesTagsDto;
/* compiled from: StoriesService.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013¨\u0006\u0017"}, d2 = {"Llya;", "Lkya;", "", LocalityEntity.FIELD_COUNTRY_CODE, "localityId", "pizzeriaId", "", c.a, "a", "Li15;", "screen", "b", "Lru/dodopizza/backend/domain/stories/StoriesApi;", "Lru/dodopizza/backend/domain/stories/StoriesApi;", "storiesApi", "Lf15;", "Lf15;", "infoStoryRepository", "Lava;", "Lava;", "stateProvider", "<init>", "(Lru/dodopizza/backend/domain/stories/StoriesApi;Lf15;Lava;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: lya  reason: default package */
/* loaded from: classes4.dex */
public final class lya implements kya {
    private final StoriesApi a;
    private final f15 b;
    private final ava c;

    /* compiled from: StoriesService.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: lya$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[i15.values().length];
            try {
                iArr[i15.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[i15.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[i15.d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public lya(StoriesApi storiesApi, f15 f15Var, ava avaVar) {
        z65.h(storiesApi, "storiesApi");
        z65.h(f15Var, "infoStoryRepository");
        z65.h(avaVar, "stateProvider");
        this.a = storiesApi;
        this.b = f15Var;
        this.c = avaVar;
    }

    @Override // defpackage.kya
    public String a() {
        String sdkKey = this.a.getInAppStorySdkKey().getSdkKey();
        if (sdkKey == null) {
            return "";
        }
        return sdkKey;
    }

    @Override // defpackage.kya
    public String b(i15 i15Var) {
        z65.h(i15Var, "screen");
        int i = a.$EnumSwitchMapping$0[i15Var.ordinal()];
        String str = null;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    b15 b15Var = this.b.get();
                    if (b15Var != null) {
                        str = b15Var.a();
                    }
                    if (str == null) {
                        return "";
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                b15 b15Var2 = this.b.get();
                if (b15Var2 != null) {
                    str = b15Var2.c();
                }
                if (str == null) {
                    return "";
                }
            }
        } else {
            b15 b15Var3 = this.b.get();
            if (b15Var3 != null) {
                str = b15Var3.b();
            }
            if (str == null) {
                return "";
            }
        }
        return str;
    }

    @Override // defpackage.kya
    public Collection<String> c(String str, String str2, String str3) {
        z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
        z65.h(str2, "localityId");
        z65.h(str3, "pizzeriaId");
        StoriesTagsDto storiesTags = this.a.getStoriesTags(jua.c(this.c.e()).i(), str, str2, str3);
        this.b.a(c15.a(storiesTags.getInfoStory()));
        List<String> tags = storiesTags.getTags();
        if (tags == null) {
            tags = kc1.l();
        }
        return tags;
    }
}
