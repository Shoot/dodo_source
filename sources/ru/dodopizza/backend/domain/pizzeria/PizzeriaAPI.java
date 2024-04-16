package ru.dodopizza.backend.domain.pizzeria;

import com.dodopizza.persistence.entity.locality.LocalityEntity;
import java.util.List;
import kotlin.Metadata;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;
import retrofit2.http.Query;
import ru.dodopizza.backend.domain.pizzeria.dto.DeferredTimeIntervalDto;
import ru.dodopizza.backend.domain.pizzeria.dto.NewPizzeriaDto;
import ru.dodopizza.backend.domain.pizzeria.dto.PizzeriaDto;
/* compiled from: PizzeriaAPI.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0006H'J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\u0006H'J\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\u0006H'J\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0001\u0010\u000f\u001a\u00020\u0006H'¨\u0006\u0010"}, d2 = {"Lru/dodopizza/backend/domain/pizzeria/PizzeriaAPI;", "", "getPizzerias", "", "Lru/dodopizza/backend/domain/pizzeria/dto/PizzeriaDto;", "localityId", "", "language", LocalityEntity.FIELD_COUNTRY_CODE, "getPizzeriasDeferredDeliveryIntervals", "Lru/dodopizza/backend/domain/pizzeria/dto/DeferredTimeIntervalDto;", "pizzeriaId", "getPizzeriasDeferredRestaurantIntervals", "getPizzeriasInCountry", "Lru/dodopizza/backend/domain/pizzeria/dto/NewPizzeriaDto;", "id", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface PizzeriaAPI {
    @GET("/api/v1/Pizzeria")
    List<PizzeriaDto> getPizzerias(@Query("LocalityId") String str, @Query("Language") String str2, @Header("CountryCode") String str3);

    @GET("/api/v1/pizzeria/{pizzeriaId}/deferredIntervals?type=delivery")
    List<DeferredTimeIntervalDto> getPizzeriasDeferredDeliveryIntervals(@Path("pizzeriaId") String str);

    @GET("/api/v1/pizzeria/{pizzeriaId}/deferredIntervals?type=restaurant")
    List<DeferredTimeIntervalDto> getPizzeriasDeferredRestaurantIntervals(@Path("pizzeriaId") String str);

    @GET("/api/v2/countries/{id}/pizzerias")
    List<NewPizzeriaDto> getPizzeriasInCountry(@Path("id") String str);
}
