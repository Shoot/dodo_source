package ru.dodopizza.backend.domain.stories;

import com.dodopizza.persistence.entity.locality.LocalityEntity;
import kotlin.Metadata;
import retrofit2.http.GET;
import retrofit2.http.Query;
import ru.dodopizza.backend.domain.stories.dto.InAppStorySdkKeyDto;
import ru.dodopizza.backend.domain.stories.dto.StoriesTagsDto;
/* compiled from: StoriesApi.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'J6\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\tH'¨\u0006\f"}, d2 = {"Lru/dodopizza/backend/domain/stories/StoriesApi;", "", "getInAppStorySdkKey", "Lru/dodopizza/backend/domain/stories/dto/InAppStorySdkKeyDto;", "getStoriesTags", "Lru/dodopizza/backend/domain/stories/dto/StoriesTagsDto;", "orderType", "", LocalityEntity.FIELD_COUNTRY_CODE, "", "localityId", "pizzeriaId", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface StoriesApi {

    /* compiled from: StoriesApi.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ StoriesTagsDto getStoriesTags$default(StoriesApi storiesApi, int i, String str, String str2, String str3, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 2) != 0) {
                    str = null;
                }
                if ((i2 & 4) != 0) {
                    str2 = null;
                }
                if ((i2 & 8) != 0) {
                    str3 = null;
                }
                return storiesApi.getStoriesTags(i, str, str2, str3);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getStoriesTags");
        }
    }

    @GET("/api/v1/stories/sdkkey")
    InAppStorySdkKeyDto getInAppStorySdkKey();

    @GET("api/v1/stories/tags")
    StoriesTagsDto getStoriesTags(@Query("orderType") int i, @Query("CountryCode") String str, @Query("LocalityId") String str2, @Query("pizzeriaId") String str3);
}
