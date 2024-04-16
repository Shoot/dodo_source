package io.realm;

import ch.qos.logback.core.joran.action.Action;
import com.dodopizza.persistence.entity.ImageEntity;
import com.dodopizza.persistence.entity.menu.ComboTemplateSlotEntity;
import com.dodopizza.persistence.entity.menu.DoughTypeEntity;
import com.dodopizza.persistence.entity.menu.ProductEntity;
import com.dodopizza.persistence.entity.menu.ProductIngredientEntity;
import com.dodopizza.persistence.entity.menu.SizeGroupEntity;
import com.dodopizza.persistence.entity.menu.ToppingEntity;
import defpackage.r89;
import im.threads.business.transport.MessageAttributes;
import io.realm.a;
import io.realm.com_dodopizza_persistence_entity_ImageEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_menu_ComboTemplateSlotEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_menu_DoughTypeEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_menu_ProductIngredientEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_menu_SizeGroupEntityRealmProxy;
import io.realm.com_dodopizza_persistence_entity_menu_ToppingEntityRealmProxy;
import io.realm.exceptions.RealmException;
import io.realm.internal.OsList;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Table;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* loaded from: classes3.dex */
public class com_dodopizza_persistence_entity_menu_ProductEntityRealmProxy extends ProductEntity implements r89, vgc {
    private static final OsObjectSchemaInfo i = g();
    private a b;
    private c0<ProductEntity> c;
    private k0<ProductIngredientEntity> d;
    private k0<ImageEntity> e;
    private k0<ProductEntity> f;
    private k0<ComboTemplateSlotEntity> g;
    private k0<ToppingEntity> h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a extends sf1 {
        long A;
        long B;
        long e;
        long f;
        long g;
        long h;
        long i;
        long j;
        long k;
        long l;
        long m;
        long n;
        long o;
        long p;
        long q;
        long r;
        long s;
        long t;
        long u;
        long v;
        long w;
        long x;
        long y;
        long z;

        a(OsSchemaInfo osSchemaInfo) {
            super(24);
            OsObjectSchemaInfo b = osSchemaInfo.b("ProductEntity");
            this.e = a("id", "id", b);
            this.f = a(Action.NAME_ATTRIBUTE, Action.NAME_ATTRIBUTE, b);
            this.g = a("category", "category", b);
            this.h = a("description", "description", b);
            this.i = a("allergens", "allergens", b);
            this.j = a("allergensCanContain", "allergensCanContain", b);
            this.k = a("ingredients", "ingredients", b);
            this.l = a("images", "images", b);
            this.m = a("sizeMeasure", "sizeMeasure", b);
            this.n = a("sizeValue", "sizeValue", b);
            this.o = a("foodValueFats", "foodValueFats", b);
            this.p = a("foodValueProteins", "foodValueProteins", b);
            this.q = a("foodValueCarbohydrates", "foodValueCarbohydrates", b);
            this.r = a("foodValueKiloCalories", "foodValueKiloCalories", b);
            this.s = a("foodValueWeight", "foodValueWeight", b);
            this.t = a(MessageAttributes.TYPE, MessageAttributes.TYPE, b);
            this.u = a("doughType", "doughType", b);
            this.v = a("sizeGroup", "sizeGroup", b);
            this.w = a("portion", "portion", b);
            this.x = a("weight", "weight", b);
            this.y = a("components", "components", b);
            this.z = a("metaProductId", "metaProductId", b);
            this.A = a("comboTemplatesSlots", "comboTemplatesSlots", b);
            this.B = a("toppings", "toppings", b);
        }

        @Override // defpackage.sf1
        protected final void b(sf1 sf1Var, sf1 sf1Var2) {
            a aVar = (a) sf1Var;
            a aVar2 = (a) sf1Var2;
            aVar2.e = aVar.e;
            aVar2.f = aVar.f;
            aVar2.g = aVar.g;
            aVar2.h = aVar.h;
            aVar2.i = aVar.i;
            aVar2.j = aVar.j;
            aVar2.k = aVar.k;
            aVar2.l = aVar.l;
            aVar2.m = aVar.m;
            aVar2.n = aVar.n;
            aVar2.o = aVar.o;
            aVar2.p = aVar.p;
            aVar2.q = aVar.q;
            aVar2.r = aVar.r;
            aVar2.s = aVar.s;
            aVar2.t = aVar.t;
            aVar2.u = aVar.u;
            aVar2.v = aVar.v;
            aVar2.w = aVar.w;
            aVar2.x = aVar.x;
            aVar2.y = aVar.y;
            aVar2.z = aVar.z;
            aVar2.A = aVar.A;
            aVar2.B = aVar.B;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com_dodopizza_persistence_entity_menu_ProductEntityRealmProxy() {
        this.c.p();
    }

    public static ProductEntity c(d0 d0Var, a aVar, ProductEntity productEntity, boolean z, Map<o89, r89> map, Set<ex4> set) {
        r89 r89Var = map.get(productEntity);
        if (r89Var != null) {
            return (ProductEntity) r89Var;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(ProductEntity.class), set);
        osObjectBuilder.E0(aVar.e, productEntity.realmGet$id());
        osObjectBuilder.E0(aVar.f, productEntity.realmGet$name());
        osObjectBuilder.E0(aVar.g, productEntity.realmGet$category());
        osObjectBuilder.E0(aVar.h, productEntity.realmGet$description());
        osObjectBuilder.E0(aVar.i, productEntity.realmGet$allergens());
        osObjectBuilder.E0(aVar.j, productEntity.realmGet$allergensCanContain());
        osObjectBuilder.E0(aVar.m, productEntity.realmGet$sizeMeasure());
        osObjectBuilder.E0(aVar.n, productEntity.realmGet$sizeValue());
        osObjectBuilder.E0(aVar.o, productEntity.realmGet$foodValueFats());
        osObjectBuilder.E0(aVar.p, productEntity.realmGet$foodValueProteins());
        osObjectBuilder.E0(aVar.q, productEntity.realmGet$foodValueCarbohydrates());
        osObjectBuilder.E0(aVar.r, productEntity.realmGet$foodValueKiloCalories());
        osObjectBuilder.E0(aVar.s, productEntity.realmGet$foodValueWeight());
        osObjectBuilder.E0(aVar.t, productEntity.realmGet$type());
        osObjectBuilder.E0(aVar.w, productEntity.realmGet$portion());
        osObjectBuilder.E0(aVar.x, productEntity.realmGet$weight());
        osObjectBuilder.E0(aVar.z, productEntity.realmGet$metaProductId());
        com_dodopizza_persistence_entity_menu_ProductEntityRealmProxy j = j(d0Var, osObjectBuilder.I0());
        map.put(productEntity, j);
        k0<ProductIngredientEntity> realmGet$ingredients = productEntity.realmGet$ingredients();
        if (realmGet$ingredients != null) {
            k0<ProductIngredientEntity> realmGet$ingredients2 = j.realmGet$ingredients();
            realmGet$ingredients2.clear();
            for (int i2 = 0; i2 < realmGet$ingredients.size(); i2++) {
                ProductIngredientEntity productIngredientEntity = realmGet$ingredients.get(i2);
                ProductIngredientEntity productIngredientEntity2 = (ProductIngredientEntity) map.get(productIngredientEntity);
                if (productIngredientEntity2 != null) {
                    realmGet$ingredients2.add(productIngredientEntity2);
                } else {
                    realmGet$ingredients2.add(com_dodopizza_persistence_entity_menu_ProductIngredientEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_menu_ProductIngredientEntityRealmProxy.a) d0Var.u().e(ProductIngredientEntity.class), productIngredientEntity, z, map, set));
                }
            }
        }
        k0<ImageEntity> realmGet$images = productEntity.realmGet$images();
        if (realmGet$images != null) {
            k0<ImageEntity> realmGet$images2 = j.realmGet$images();
            realmGet$images2.clear();
            for (int i3 = 0; i3 < realmGet$images.size(); i3++) {
                ImageEntity imageEntity = realmGet$images.get(i3);
                ImageEntity imageEntity2 = (ImageEntity) map.get(imageEntity);
                if (imageEntity2 != null) {
                    realmGet$images2.add(imageEntity2);
                } else {
                    realmGet$images2.add(com_dodopizza_persistence_entity_ImageEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_ImageEntityRealmProxy.a) d0Var.u().e(ImageEntity.class), imageEntity, z, map, set));
                }
            }
        }
        DoughTypeEntity realmGet$doughType = productEntity.realmGet$doughType();
        if (realmGet$doughType == null) {
            j.realmSet$doughType(null);
        } else {
            DoughTypeEntity doughTypeEntity = (DoughTypeEntity) map.get(realmGet$doughType);
            if (doughTypeEntity != null) {
                j.realmSet$doughType(doughTypeEntity);
            } else {
                j.realmSet$doughType(com_dodopizza_persistence_entity_menu_DoughTypeEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_menu_DoughTypeEntityRealmProxy.a) d0Var.u().e(DoughTypeEntity.class), realmGet$doughType, z, map, set));
            }
        }
        SizeGroupEntity realmGet$sizeGroup = productEntity.realmGet$sizeGroup();
        if (realmGet$sizeGroup == null) {
            j.realmSet$sizeGroup(null);
        } else {
            SizeGroupEntity sizeGroupEntity = (SizeGroupEntity) map.get(realmGet$sizeGroup);
            if (sizeGroupEntity != null) {
                j.realmSet$sizeGroup(sizeGroupEntity);
            } else {
                j.realmSet$sizeGroup(com_dodopizza_persistence_entity_menu_SizeGroupEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_menu_SizeGroupEntityRealmProxy.a) d0Var.u().e(SizeGroupEntity.class), realmGet$sizeGroup, z, map, set));
            }
        }
        k0<ProductEntity> realmGet$components = productEntity.realmGet$components();
        if (realmGet$components != null) {
            k0<ProductEntity> realmGet$components2 = j.realmGet$components();
            realmGet$components2.clear();
            for (int i4 = 0; i4 < realmGet$components.size(); i4++) {
                ProductEntity productEntity2 = realmGet$components.get(i4);
                ProductEntity productEntity3 = (ProductEntity) map.get(productEntity2);
                if (productEntity3 != null) {
                    realmGet$components2.add(productEntity3);
                } else {
                    realmGet$components2.add(d(d0Var, (a) d0Var.u().e(ProductEntity.class), productEntity2, z, map, set));
                }
            }
        }
        k0<ComboTemplateSlotEntity> realmGet$comboTemplatesSlots = productEntity.realmGet$comboTemplatesSlots();
        if (realmGet$comboTemplatesSlots != null) {
            k0<ComboTemplateSlotEntity> realmGet$comboTemplatesSlots2 = j.realmGet$comboTemplatesSlots();
            realmGet$comboTemplatesSlots2.clear();
            for (int i5 = 0; i5 < realmGet$comboTemplatesSlots.size(); i5++) {
                ComboTemplateSlotEntity comboTemplateSlotEntity = realmGet$comboTemplatesSlots.get(i5);
                ComboTemplateSlotEntity comboTemplateSlotEntity2 = (ComboTemplateSlotEntity) map.get(comboTemplateSlotEntity);
                if (comboTemplateSlotEntity2 != null) {
                    realmGet$comboTemplatesSlots2.add(comboTemplateSlotEntity2);
                } else {
                    realmGet$comboTemplatesSlots2.add(com_dodopizza_persistence_entity_menu_ComboTemplateSlotEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_menu_ComboTemplateSlotEntityRealmProxy.a) d0Var.u().e(ComboTemplateSlotEntity.class), comboTemplateSlotEntity, z, map, set));
                }
            }
        }
        k0<ToppingEntity> realmGet$toppings = productEntity.realmGet$toppings();
        if (realmGet$toppings != null) {
            k0<ToppingEntity> realmGet$toppings2 = j.realmGet$toppings();
            realmGet$toppings2.clear();
            for (int i6 = 0; i6 < realmGet$toppings.size(); i6++) {
                ToppingEntity toppingEntity = realmGet$toppings.get(i6);
                ToppingEntity toppingEntity2 = (ToppingEntity) map.get(toppingEntity);
                if (toppingEntity2 != null) {
                    realmGet$toppings2.add(toppingEntity2);
                } else {
                    realmGet$toppings2.add(com_dodopizza_persistence_entity_menu_ToppingEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_menu_ToppingEntityRealmProxy.a) d0Var.u().e(ToppingEntity.class), toppingEntity, z, map, set));
                }
            }
        }
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.dodopizza.persistence.entity.menu.ProductEntity d(io.realm.d0 r8, io.realm.com_dodopizza_persistence_entity_menu_ProductEntityRealmProxy.a r9, com.dodopizza.persistence.entity.menu.ProductEntity r10, boolean r11, java.util.Map<defpackage.o89, defpackage.r89> r12, java.util.Set<defpackage.ex4> r13) {
        /*
            boolean r0 = r10 instanceof defpackage.r89
            if (r0 == 0) goto L3e
            boolean r0 = io.realm.n0.isFrozen(r10)
            if (r0 != 0) goto L3e
            r0 = r10
            r89 r0 = (defpackage.r89) r0
            io.realm.c0 r1 = r0.a()
            io.realm.a r1 = r1.f()
            if (r1 == 0) goto L3e
            io.realm.c0 r0 = r0.a()
            io.realm.a r0 = r0.f()
            long r1 = r0.b
            long r3 = r8.b
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L36
            java.lang.String r0 = r0.getPath()
            java.lang.String r1 = r8.getPath()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3e
            return r10
        L36:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Objects which belong to Realm instances in other threads cannot be copied into this Realm instance."
            r8.<init>(r9)
            throw r8
        L3e:
            io.realm.a$d r0 = io.realm.a.k
            java.lang.Object r0 = r0.get()
            io.realm.a$c r0 = (io.realm.a.c) r0
            java.lang.Object r1 = r12.get(r10)
            r89 r1 = (defpackage.r89) r1
            if (r1 == 0) goto L51
            com.dodopizza.persistence.entity.menu.ProductEntity r1 = (com.dodopizza.persistence.entity.menu.ProductEntity) r1
            return r1
        L51:
            r1 = 0
            if (r11 == 0) goto L8e
            java.lang.Class<com.dodopizza.persistence.entity.menu.ProductEntity> r2 = com.dodopizza.persistence.entity.menu.ProductEntity.class
            io.realm.internal.Table r2 = r8.I0(r2)
            long r3 = r9.e
            java.lang.String r5 = r10.realmGet$id()
            if (r5 != 0) goto L67
            long r3 = r2.c(r3)
            goto L6b
        L67:
            long r3 = r2.d(r3, r5)
        L6b:
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L74
            r0 = 0
        L72:
            r3 = r1
            goto L95
        L74:
            io.realm.internal.UncheckedRow r3 = r2.r(r3)     // Catch: java.lang.Throwable -> L90
            r5 = 0
            java.util.List r6 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> L90
            r1 = r0
            r2 = r8
            r4 = r9
            r1.g(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L90
            io.realm.com_dodopizza_persistence_entity_menu_ProductEntityRealmProxy r1 = new io.realm.com_dodopizza_persistence_entity_menu_ProductEntityRealmProxy     // Catch: java.lang.Throwable -> L90
            r1.<init>()     // Catch: java.lang.Throwable -> L90
            r12.put(r10, r1)     // Catch: java.lang.Throwable -> L90
            r0.a()
        L8e:
            r0 = r11
            goto L72
        L90:
            r8 = move-exception
            r0.a()
            throw r8
        L95:
            if (r0 == 0) goto La1
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r12
            r6 = r13
            com.dodopizza.persistence.entity.menu.ProductEntity r8 = k(r1, r2, r3, r4, r5, r6)
            goto La5
        La1:
            com.dodopizza.persistence.entity.menu.ProductEntity r8 = c(r8, r9, r10, r11, r12, r13)
        La5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_dodopizza_persistence_entity_menu_ProductEntityRealmProxy.d(io.realm.d0, io.realm.com_dodopizza_persistence_entity_menu_ProductEntityRealmProxy$a, com.dodopizza.persistence.entity.menu.ProductEntity, boolean, java.util.Map, java.util.Set):com.dodopizza.persistence.entity.menu.ProductEntity");
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static ProductEntity f(ProductEntity productEntity, int i2, int i3, Map<o89, r89.a<o89>> map) {
        ProductEntity productEntity2;
        if (i2 > i3 || productEntity == null) {
            return null;
        }
        r89.a<o89> aVar = map.get(productEntity);
        if (aVar == null) {
            productEntity2 = new ProductEntity();
            map.put(productEntity, new r89.a<>(i2, productEntity2));
        } else if (i2 >= aVar.a) {
            return (ProductEntity) aVar.b;
        } else {
            aVar.a = i2;
            productEntity2 = (ProductEntity) aVar.b;
        }
        d0 d0Var = (d0) ((r89) productEntity).a().f();
        productEntity2.realmSet$id(productEntity.realmGet$id());
        productEntity2.realmSet$name(productEntity.realmGet$name());
        productEntity2.realmSet$category(productEntity.realmGet$category());
        productEntity2.realmSet$description(productEntity.realmGet$description());
        productEntity2.realmSet$allergens(productEntity.realmGet$allergens());
        productEntity2.realmSet$allergensCanContain(productEntity.realmGet$allergensCanContain());
        if (i2 == i3) {
            productEntity2.realmSet$ingredients(null);
        } else {
            k0<ProductIngredientEntity> realmGet$ingredients = productEntity.realmGet$ingredients();
            k0<ProductIngredientEntity> k0Var = new k0<>();
            productEntity2.realmSet$ingredients(k0Var);
            int i4 = i2 + 1;
            int size = realmGet$ingredients.size();
            for (int i5 = 0; i5 < size; i5++) {
                k0Var.add(com_dodopizza_persistence_entity_menu_ProductIngredientEntityRealmProxy.f(realmGet$ingredients.get(i5), i4, i3, map));
            }
        }
        if (i2 == i3) {
            productEntity2.realmSet$images(null);
        } else {
            k0<ImageEntity> realmGet$images = productEntity.realmGet$images();
            k0<ImageEntity> k0Var2 = new k0<>();
            productEntity2.realmSet$images(k0Var2);
            int i6 = i2 + 1;
            int size2 = realmGet$images.size();
            for (int i7 = 0; i7 < size2; i7++) {
                k0Var2.add(com_dodopizza_persistence_entity_ImageEntityRealmProxy.f(realmGet$images.get(i7), i6, i3, map));
            }
        }
        productEntity2.realmSet$sizeMeasure(productEntity.realmGet$sizeMeasure());
        productEntity2.realmSet$sizeValue(productEntity.realmGet$sizeValue());
        productEntity2.realmSet$foodValueFats(productEntity.realmGet$foodValueFats());
        productEntity2.realmSet$foodValueProteins(productEntity.realmGet$foodValueProteins());
        productEntity2.realmSet$foodValueCarbohydrates(productEntity.realmGet$foodValueCarbohydrates());
        productEntity2.realmSet$foodValueKiloCalories(productEntity.realmGet$foodValueKiloCalories());
        productEntity2.realmSet$foodValueWeight(productEntity.realmGet$foodValueWeight());
        productEntity2.realmSet$type(productEntity.realmGet$type());
        int i8 = i2 + 1;
        productEntity2.realmSet$doughType(com_dodopizza_persistence_entity_menu_DoughTypeEntityRealmProxy.f(productEntity.realmGet$doughType(), i8, i3, map));
        productEntity2.realmSet$sizeGroup(com_dodopizza_persistence_entity_menu_SizeGroupEntityRealmProxy.f(productEntity.realmGet$sizeGroup(), i8, i3, map));
        productEntity2.realmSet$portion(productEntity.realmGet$portion());
        productEntity2.realmSet$weight(productEntity.realmGet$weight());
        if (i2 == i3) {
            productEntity2.realmSet$components(null);
        } else {
            k0<ProductEntity> realmGet$components = productEntity.realmGet$components();
            k0<ProductEntity> k0Var3 = new k0<>();
            productEntity2.realmSet$components(k0Var3);
            int size3 = realmGet$components.size();
            for (int i9 = 0; i9 < size3; i9++) {
                k0Var3.add(f(realmGet$components.get(i9), i8, i3, map));
            }
        }
        productEntity2.realmSet$metaProductId(productEntity.realmGet$metaProductId());
        if (i2 == i3) {
            productEntity2.realmSet$comboTemplatesSlots(null);
        } else {
            k0<ComboTemplateSlotEntity> realmGet$comboTemplatesSlots = productEntity.realmGet$comboTemplatesSlots();
            k0<ComboTemplateSlotEntity> k0Var4 = new k0<>();
            productEntity2.realmSet$comboTemplatesSlots(k0Var4);
            int size4 = realmGet$comboTemplatesSlots.size();
            for (int i10 = 0; i10 < size4; i10++) {
                k0Var4.add(com_dodopizza_persistence_entity_menu_ComboTemplateSlotEntityRealmProxy.f(realmGet$comboTemplatesSlots.get(i10), i8, i3, map));
            }
        }
        if (i2 == i3) {
            productEntity2.realmSet$toppings(null);
        } else {
            k0<ToppingEntity> realmGet$toppings = productEntity.realmGet$toppings();
            k0<ToppingEntity> k0Var5 = new k0<>();
            productEntity2.realmSet$toppings(k0Var5);
            int size5 = realmGet$toppings.size();
            for (int i11 = 0; i11 < size5; i11++) {
                k0Var5.add(com_dodopizza_persistence_entity_menu_ToppingEntityRealmProxy.f(realmGet$toppings.get(i11), i8, i3, map));
            }
        }
        return productEntity2;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "ProductEntity", false, 24, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", "id", realmFieldType, true, false, false);
        bVar.b("", Action.NAME_ATTRIBUTE, realmFieldType, false, false, true);
        bVar.b("", "category", realmFieldType, false, false, true);
        bVar.b("", "description", realmFieldType, false, false, true);
        bVar.b("", "allergens", realmFieldType, false, false, true);
        bVar.b("", "allergensCanContain", realmFieldType, false, false, true);
        RealmFieldType realmFieldType2 = RealmFieldType.LIST;
        bVar.a("", "ingredients", realmFieldType2, "ProductIngredientEntity");
        bVar.a("", "images", realmFieldType2, "ImageEntity");
        bVar.b("", "sizeMeasure", realmFieldType, false, false, true);
        bVar.b("", "sizeValue", realmFieldType, false, false, true);
        bVar.b("", "foodValueFats", realmFieldType, false, false, true);
        bVar.b("", "foodValueProteins", realmFieldType, false, false, true);
        bVar.b("", "foodValueCarbohydrates", realmFieldType, false, false, true);
        bVar.b("", "foodValueKiloCalories", realmFieldType, false, false, true);
        bVar.b("", "foodValueWeight", realmFieldType, false, false, true);
        bVar.b("", MessageAttributes.TYPE, realmFieldType, false, false, true);
        RealmFieldType realmFieldType3 = RealmFieldType.OBJECT;
        bVar.a("", "doughType", realmFieldType3, "DoughTypeEntity");
        bVar.a("", "sizeGroup", realmFieldType3, "SizeGroupEntity");
        bVar.b("", "portion", realmFieldType, false, false, true);
        bVar.b("", "weight", realmFieldType, false, false, true);
        bVar.a("", "components", realmFieldType2, "ProductEntity");
        bVar.b("", "metaProductId", realmFieldType, false, false, true);
        bVar.a("", "comboTemplatesSlots", realmFieldType2, "ComboTemplateSlotEntity");
        bVar.a("", "toppings", realmFieldType2, "ToppingEntity");
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return i;
    }

    public static long i(d0 d0Var, ProductEntity productEntity, Map<o89, Long> map) {
        long nativeFindFirstString;
        long j;
        long j2;
        long j3;
        if ((productEntity instanceof r89) && !n0.isFrozen(productEntity)) {
            r89 r89Var = (r89) productEntity;
            if (r89Var.a().f() != null && r89Var.a().f().getPath().equals(d0Var.getPath())) {
                return r89Var.a().g().E0();
            }
        }
        Table I0 = d0Var.I0(ProductEntity.class);
        long nativePtr = I0.getNativePtr();
        a aVar = (a) d0Var.u().e(ProductEntity.class);
        long j4 = aVar.e;
        String realmGet$id = productEntity.realmGet$id();
        if (realmGet$id == null) {
            nativeFindFirstString = Table.nativeFindFirstNull(nativePtr, j4);
        } else {
            nativeFindFirstString = Table.nativeFindFirstString(nativePtr, j4, realmGet$id);
        }
        if (nativeFindFirstString == -1) {
            nativeFindFirstString = OsObject.createRowWithPrimaryKey(I0, j4, realmGet$id);
        }
        long j5 = nativeFindFirstString;
        map.put(productEntity, Long.valueOf(j5));
        String realmGet$name = productEntity.realmGet$name();
        if (realmGet$name != null) {
            j = j5;
            Table.nativeSetString(nativePtr, aVar.f, j5, realmGet$name, false);
        } else {
            j = j5;
            Table.nativeSetNull(nativePtr, aVar.f, j, false);
        }
        String realmGet$category = productEntity.realmGet$category();
        if (realmGet$category != null) {
            Table.nativeSetString(nativePtr, aVar.g, j, realmGet$category, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.g, j, false);
        }
        String realmGet$description = productEntity.realmGet$description();
        if (realmGet$description != null) {
            Table.nativeSetString(nativePtr, aVar.h, j, realmGet$description, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.h, j, false);
        }
        String realmGet$allergens = productEntity.realmGet$allergens();
        if (realmGet$allergens != null) {
            Table.nativeSetString(nativePtr, aVar.i, j, realmGet$allergens, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.i, j, false);
        }
        String realmGet$allergensCanContain = productEntity.realmGet$allergensCanContain();
        if (realmGet$allergensCanContain != null) {
            Table.nativeSetString(nativePtr, aVar.j, j, realmGet$allergensCanContain, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.j, j, false);
        }
        long j6 = j;
        OsList osList = new OsList(I0.r(j6), aVar.k);
        k0<ProductIngredientEntity> realmGet$ingredients = productEntity.realmGet$ingredients();
        if (realmGet$ingredients != null && realmGet$ingredients.size() == osList.X()) {
            int size = realmGet$ingredients.size();
            int i2 = 0;
            while (i2 < size) {
                ProductIngredientEntity productIngredientEntity = realmGet$ingredients.get(i2);
                Long l = map.get(productIngredientEntity);
                if (l == null) {
                    l = Long.valueOf(com_dodopizza_persistence_entity_menu_ProductIngredientEntityRealmProxy.i(d0Var, productIngredientEntity, map));
                }
                osList.U(i2, l.longValue());
                i2++;
                nativePtr = nativePtr;
            }
            j2 = nativePtr;
        } else {
            j2 = nativePtr;
            osList.J();
            if (realmGet$ingredients != null) {
                Iterator<ProductIngredientEntity> it = realmGet$ingredients.iterator();
                while (it.hasNext()) {
                    ProductIngredientEntity next = it.next();
                    Long l2 = map.get(next);
                    if (l2 == null) {
                        l2 = Long.valueOf(com_dodopizza_persistence_entity_menu_ProductIngredientEntityRealmProxy.i(d0Var, next, map));
                    }
                    osList.k(l2.longValue());
                }
            }
        }
        OsList osList2 = new OsList(I0.r(j6), aVar.l);
        k0<ImageEntity> realmGet$images = productEntity.realmGet$images();
        if (realmGet$images != null && realmGet$images.size() == osList2.X()) {
            int size2 = realmGet$images.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ImageEntity imageEntity = realmGet$images.get(i3);
                Long l3 = map.get(imageEntity);
                if (l3 == null) {
                    l3 = Long.valueOf(com_dodopizza_persistence_entity_ImageEntityRealmProxy.i(d0Var, imageEntity, map));
                }
                osList2.U(i3, l3.longValue());
            }
        } else {
            osList2.J();
            if (realmGet$images != null) {
                Iterator<ImageEntity> it2 = realmGet$images.iterator();
                while (it2.hasNext()) {
                    ImageEntity next2 = it2.next();
                    Long l4 = map.get(next2);
                    if (l4 == null) {
                        l4 = Long.valueOf(com_dodopizza_persistence_entity_ImageEntityRealmProxy.i(d0Var, next2, map));
                    }
                    osList2.k(l4.longValue());
                }
            }
        }
        String realmGet$sizeMeasure = productEntity.realmGet$sizeMeasure();
        if (realmGet$sizeMeasure != null) {
            j3 = j6;
            Table.nativeSetString(j2, aVar.m, j6, realmGet$sizeMeasure, false);
        } else {
            j3 = j6;
            Table.nativeSetNull(j2, aVar.m, j3, false);
        }
        String realmGet$sizeValue = productEntity.realmGet$sizeValue();
        if (realmGet$sizeValue != null) {
            Table.nativeSetString(j2, aVar.n, j3, realmGet$sizeValue, false);
        } else {
            Table.nativeSetNull(j2, aVar.n, j3, false);
        }
        String realmGet$foodValueFats = productEntity.realmGet$foodValueFats();
        if (realmGet$foodValueFats != null) {
            Table.nativeSetString(j2, aVar.o, j3, realmGet$foodValueFats, false);
        } else {
            Table.nativeSetNull(j2, aVar.o, j3, false);
        }
        String realmGet$foodValueProteins = productEntity.realmGet$foodValueProteins();
        if (realmGet$foodValueProteins != null) {
            Table.nativeSetString(j2, aVar.p, j3, realmGet$foodValueProteins, false);
        } else {
            Table.nativeSetNull(j2, aVar.p, j3, false);
        }
        String realmGet$foodValueCarbohydrates = productEntity.realmGet$foodValueCarbohydrates();
        if (realmGet$foodValueCarbohydrates != null) {
            Table.nativeSetString(j2, aVar.q, j3, realmGet$foodValueCarbohydrates, false);
        } else {
            Table.nativeSetNull(j2, aVar.q, j3, false);
        }
        String realmGet$foodValueKiloCalories = productEntity.realmGet$foodValueKiloCalories();
        if (realmGet$foodValueKiloCalories != null) {
            Table.nativeSetString(j2, aVar.r, j3, realmGet$foodValueKiloCalories, false);
        } else {
            Table.nativeSetNull(j2, aVar.r, j3, false);
        }
        String realmGet$foodValueWeight = productEntity.realmGet$foodValueWeight();
        if (realmGet$foodValueWeight != null) {
            Table.nativeSetString(j2, aVar.s, j3, realmGet$foodValueWeight, false);
        } else {
            Table.nativeSetNull(j2, aVar.s, j3, false);
        }
        String realmGet$type = productEntity.realmGet$type();
        if (realmGet$type != null) {
            Table.nativeSetString(j2, aVar.t, j3, realmGet$type, false);
        } else {
            Table.nativeSetNull(j2, aVar.t, j3, false);
        }
        DoughTypeEntity realmGet$doughType = productEntity.realmGet$doughType();
        if (realmGet$doughType != null) {
            Long l5 = map.get(realmGet$doughType);
            if (l5 == null) {
                l5 = Long.valueOf(com_dodopizza_persistence_entity_menu_DoughTypeEntityRealmProxy.i(d0Var, realmGet$doughType, map));
            }
            Table.nativeSetLink(j2, aVar.u, j3, l5.longValue(), false);
        } else {
            Table.nativeNullifyLink(j2, aVar.u, j3);
        }
        SizeGroupEntity realmGet$sizeGroup = productEntity.realmGet$sizeGroup();
        if (realmGet$sizeGroup != null) {
            Long l6 = map.get(realmGet$sizeGroup);
            if (l6 == null) {
                l6 = Long.valueOf(com_dodopizza_persistence_entity_menu_SizeGroupEntityRealmProxy.i(d0Var, realmGet$sizeGroup, map));
            }
            Table.nativeSetLink(j2, aVar.v, j3, l6.longValue(), false);
        } else {
            Table.nativeNullifyLink(j2, aVar.v, j3);
        }
        String realmGet$portion = productEntity.realmGet$portion();
        if (realmGet$portion != null) {
            Table.nativeSetString(j2, aVar.w, j3, realmGet$portion, false);
        } else {
            Table.nativeSetNull(j2, aVar.w, j3, false);
        }
        String realmGet$weight = productEntity.realmGet$weight();
        if (realmGet$weight != null) {
            Table.nativeSetString(j2, aVar.x, j3, realmGet$weight, false);
        } else {
            Table.nativeSetNull(j2, aVar.x, j3, false);
        }
        long j7 = j3;
        OsList osList3 = new OsList(I0.r(j7), aVar.y);
        k0<ProductEntity> realmGet$components = productEntity.realmGet$components();
        if (realmGet$components != null && realmGet$components.size() == osList3.X()) {
            int size3 = realmGet$components.size();
            for (int i4 = 0; i4 < size3; i4++) {
                ProductEntity productEntity2 = realmGet$components.get(i4);
                Long l7 = map.get(productEntity2);
                if (l7 == null) {
                    l7 = Long.valueOf(i(d0Var, productEntity2, map));
                }
                osList3.U(i4, l7.longValue());
            }
        } else {
            osList3.J();
            if (realmGet$components != null) {
                Iterator<ProductEntity> it3 = realmGet$components.iterator();
                while (it3.hasNext()) {
                    ProductEntity next3 = it3.next();
                    Long l8 = map.get(next3);
                    if (l8 == null) {
                        l8 = Long.valueOf(i(d0Var, next3, map));
                    }
                    osList3.k(l8.longValue());
                }
            }
        }
        String realmGet$metaProductId = productEntity.realmGet$metaProductId();
        if (realmGet$metaProductId != null) {
            Table.nativeSetString(j2, aVar.z, j7, realmGet$metaProductId, false);
        } else {
            Table.nativeSetNull(j2, aVar.z, j7, false);
        }
        OsList osList4 = new OsList(I0.r(j7), aVar.A);
        k0<ComboTemplateSlotEntity> realmGet$comboTemplatesSlots = productEntity.realmGet$comboTemplatesSlots();
        if (realmGet$comboTemplatesSlots != null && realmGet$comboTemplatesSlots.size() == osList4.X()) {
            int size4 = realmGet$comboTemplatesSlots.size();
            for (int i5 = 0; i5 < size4; i5++) {
                ComboTemplateSlotEntity comboTemplateSlotEntity = realmGet$comboTemplatesSlots.get(i5);
                Long l9 = map.get(comboTemplateSlotEntity);
                if (l9 == null) {
                    l9 = Long.valueOf(com_dodopizza_persistence_entity_menu_ComboTemplateSlotEntityRealmProxy.i(d0Var, comboTemplateSlotEntity, map));
                }
                osList4.U(i5, l9.longValue());
            }
        } else {
            osList4.J();
            if (realmGet$comboTemplatesSlots != null) {
                Iterator<ComboTemplateSlotEntity> it4 = realmGet$comboTemplatesSlots.iterator();
                while (it4.hasNext()) {
                    ComboTemplateSlotEntity next4 = it4.next();
                    Long l10 = map.get(next4);
                    if (l10 == null) {
                        l10 = Long.valueOf(com_dodopizza_persistence_entity_menu_ComboTemplateSlotEntityRealmProxy.i(d0Var, next4, map));
                    }
                    osList4.k(l10.longValue());
                }
            }
        }
        OsList osList5 = new OsList(I0.r(j7), aVar.B);
        k0<ToppingEntity> realmGet$toppings = productEntity.realmGet$toppings();
        if (realmGet$toppings != null && realmGet$toppings.size() == osList5.X()) {
            int size5 = realmGet$toppings.size();
            for (int i6 = 0; i6 < size5; i6++) {
                ToppingEntity toppingEntity = realmGet$toppings.get(i6);
                Long l11 = map.get(toppingEntity);
                if (l11 == null) {
                    l11 = Long.valueOf(com_dodopizza_persistence_entity_menu_ToppingEntityRealmProxy.i(d0Var, toppingEntity, map));
                }
                osList5.U(i6, l11.longValue());
            }
        } else {
            osList5.J();
            if (realmGet$toppings != null) {
                Iterator<ToppingEntity> it5 = realmGet$toppings.iterator();
                while (it5.hasNext()) {
                    ToppingEntity next5 = it5.next();
                    Long l12 = map.get(next5);
                    if (l12 == null) {
                        l12 = Long.valueOf(com_dodopizza_persistence_entity_menu_ToppingEntityRealmProxy.i(d0Var, next5, map));
                    }
                    osList5.k(l12.longValue());
                }
            }
        }
        return j7;
    }

    static com_dodopizza_persistence_entity_menu_ProductEntityRealmProxy j(io.realm.a aVar, fp9 fp9Var) {
        a.c cVar = io.realm.a.k.get();
        cVar.g(aVar, fp9Var, aVar.u().e(ProductEntity.class), false, Collections.emptyList());
        com_dodopizza_persistence_entity_menu_ProductEntityRealmProxy com_dodopizza_persistence_entity_menu_productentityrealmproxy = new com_dodopizza_persistence_entity_menu_ProductEntityRealmProxy();
        cVar.a();
        return com_dodopizza_persistence_entity_menu_productentityrealmproxy;
    }

    static ProductEntity k(d0 d0Var, a aVar, ProductEntity productEntity, ProductEntity productEntity2, Map<o89, r89> map, Set<ex4> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(ProductEntity.class), set);
        osObjectBuilder.E0(aVar.e, productEntity2.realmGet$id());
        osObjectBuilder.E0(aVar.f, productEntity2.realmGet$name());
        osObjectBuilder.E0(aVar.g, productEntity2.realmGet$category());
        osObjectBuilder.E0(aVar.h, productEntity2.realmGet$description());
        osObjectBuilder.E0(aVar.i, productEntity2.realmGet$allergens());
        osObjectBuilder.E0(aVar.j, productEntity2.realmGet$allergensCanContain());
        k0<ProductIngredientEntity> realmGet$ingredients = productEntity2.realmGet$ingredients();
        if (realmGet$ingredients != null) {
            k0 k0Var = new k0();
            for (int i2 = 0; i2 < realmGet$ingredients.size(); i2++) {
                ProductIngredientEntity productIngredientEntity = realmGet$ingredients.get(i2);
                ProductIngredientEntity productIngredientEntity2 = (ProductIngredientEntity) map.get(productIngredientEntity);
                if (productIngredientEntity2 != null) {
                    k0Var.add(productIngredientEntity2);
                } else {
                    k0Var.add(com_dodopizza_persistence_entity_menu_ProductIngredientEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_menu_ProductIngredientEntityRealmProxy.a) d0Var.u().e(ProductIngredientEntity.class), productIngredientEntity, true, map, set));
                }
            }
            osObjectBuilder.z0(aVar.k, k0Var);
        } else {
            osObjectBuilder.z0(aVar.k, new k0());
        }
        k0<ImageEntity> realmGet$images = productEntity2.realmGet$images();
        if (realmGet$images != null) {
            k0 k0Var2 = new k0();
            for (int i3 = 0; i3 < realmGet$images.size(); i3++) {
                ImageEntity imageEntity = realmGet$images.get(i3);
                ImageEntity imageEntity2 = (ImageEntity) map.get(imageEntity);
                if (imageEntity2 != null) {
                    k0Var2.add(imageEntity2);
                } else {
                    k0Var2.add(com_dodopizza_persistence_entity_ImageEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_ImageEntityRealmProxy.a) d0Var.u().e(ImageEntity.class), imageEntity, true, map, set));
                }
            }
            osObjectBuilder.z0(aVar.l, k0Var2);
        } else {
            osObjectBuilder.z0(aVar.l, new k0());
        }
        osObjectBuilder.E0(aVar.m, productEntity2.realmGet$sizeMeasure());
        osObjectBuilder.E0(aVar.n, productEntity2.realmGet$sizeValue());
        osObjectBuilder.E0(aVar.o, productEntity2.realmGet$foodValueFats());
        osObjectBuilder.E0(aVar.p, productEntity2.realmGet$foodValueProteins());
        osObjectBuilder.E0(aVar.q, productEntity2.realmGet$foodValueCarbohydrates());
        osObjectBuilder.E0(aVar.r, productEntity2.realmGet$foodValueKiloCalories());
        osObjectBuilder.E0(aVar.s, productEntity2.realmGet$foodValueWeight());
        osObjectBuilder.E0(aVar.t, productEntity2.realmGet$type());
        DoughTypeEntity realmGet$doughType = productEntity2.realmGet$doughType();
        if (realmGet$doughType == null) {
            osObjectBuilder.r0(aVar.u);
        } else {
            DoughTypeEntity doughTypeEntity = (DoughTypeEntity) map.get(realmGet$doughType);
            if (doughTypeEntity != null) {
                osObjectBuilder.x0(aVar.u, doughTypeEntity);
            } else {
                osObjectBuilder.x0(aVar.u, com_dodopizza_persistence_entity_menu_DoughTypeEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_menu_DoughTypeEntityRealmProxy.a) d0Var.u().e(DoughTypeEntity.class), realmGet$doughType, true, map, set));
            }
        }
        SizeGroupEntity realmGet$sizeGroup = productEntity2.realmGet$sizeGroup();
        if (realmGet$sizeGroup == null) {
            osObjectBuilder.r0(aVar.v);
        } else {
            SizeGroupEntity sizeGroupEntity = (SizeGroupEntity) map.get(realmGet$sizeGroup);
            if (sizeGroupEntity != null) {
                osObjectBuilder.x0(aVar.v, sizeGroupEntity);
            } else {
                osObjectBuilder.x0(aVar.v, com_dodopizza_persistence_entity_menu_SizeGroupEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_menu_SizeGroupEntityRealmProxy.a) d0Var.u().e(SizeGroupEntity.class), realmGet$sizeGroup, true, map, set));
            }
        }
        osObjectBuilder.E0(aVar.w, productEntity2.realmGet$portion());
        osObjectBuilder.E0(aVar.x, productEntity2.realmGet$weight());
        k0<ProductEntity> realmGet$components = productEntity2.realmGet$components();
        if (realmGet$components != null) {
            k0 k0Var3 = new k0();
            for (int i4 = 0; i4 < realmGet$components.size(); i4++) {
                ProductEntity productEntity3 = realmGet$components.get(i4);
                ProductEntity productEntity4 = (ProductEntity) map.get(productEntity3);
                if (productEntity4 != null) {
                    k0Var3.add(productEntity4);
                } else {
                    k0Var3.add(d(d0Var, (a) d0Var.u().e(ProductEntity.class), productEntity3, true, map, set));
                }
            }
            osObjectBuilder.z0(aVar.y, k0Var3);
        } else {
            osObjectBuilder.z0(aVar.y, new k0());
        }
        osObjectBuilder.E0(aVar.z, productEntity2.realmGet$metaProductId());
        k0<ComboTemplateSlotEntity> realmGet$comboTemplatesSlots = productEntity2.realmGet$comboTemplatesSlots();
        if (realmGet$comboTemplatesSlots != null) {
            k0 k0Var4 = new k0();
            for (int i5 = 0; i5 < realmGet$comboTemplatesSlots.size(); i5++) {
                ComboTemplateSlotEntity comboTemplateSlotEntity = realmGet$comboTemplatesSlots.get(i5);
                ComboTemplateSlotEntity comboTemplateSlotEntity2 = (ComboTemplateSlotEntity) map.get(comboTemplateSlotEntity);
                if (comboTemplateSlotEntity2 != null) {
                    k0Var4.add(comboTemplateSlotEntity2);
                } else {
                    k0Var4.add(com_dodopizza_persistence_entity_menu_ComboTemplateSlotEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_menu_ComboTemplateSlotEntityRealmProxy.a) d0Var.u().e(ComboTemplateSlotEntity.class), comboTemplateSlotEntity, true, map, set));
                }
            }
            osObjectBuilder.z0(aVar.A, k0Var4);
        } else {
            osObjectBuilder.z0(aVar.A, new k0());
        }
        k0<ToppingEntity> realmGet$toppings = productEntity2.realmGet$toppings();
        if (realmGet$toppings != null) {
            k0 k0Var5 = new k0();
            for (int i6 = 0; i6 < realmGet$toppings.size(); i6++) {
                ToppingEntity toppingEntity = realmGet$toppings.get(i6);
                ToppingEntity toppingEntity2 = (ToppingEntity) map.get(toppingEntity);
                if (toppingEntity2 != null) {
                    k0Var5.add(toppingEntity2);
                } else {
                    k0Var5.add(com_dodopizza_persistence_entity_menu_ToppingEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_menu_ToppingEntityRealmProxy.a) d0Var.u().e(ToppingEntity.class), toppingEntity, true, map, set));
                }
            }
            osObjectBuilder.z0(aVar.B, k0Var5);
        } else {
            osObjectBuilder.z0(aVar.B, new k0());
        }
        osObjectBuilder.K0();
        return productEntity;
    }

    @Override // defpackage.r89
    public c0<?> a() {
        return this.c;
    }

    @Override // defpackage.r89
    public void b() {
        if (this.c != null) {
            return;
        }
        a.c cVar = io.realm.a.k.get();
        this.b = (a) cVar.c();
        c0<ProductEntity> c0Var = new c0<>(this);
        this.c = c0Var;
        c0Var.r(cVar.e());
        this.c.s(cVar.f());
        this.c.o(cVar.b());
        this.c.q(cVar.d());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com_dodopizza_persistence_entity_menu_ProductEntityRealmProxy com_dodopizza_persistence_entity_menu_productentityrealmproxy = (com_dodopizza_persistence_entity_menu_ProductEntityRealmProxy) obj;
        io.realm.a f = this.c.f();
        io.realm.a f2 = com_dodopizza_persistence_entity_menu_productentityrealmproxy.c.f();
        String path = f.getPath();
        String path2 = f2.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f.E() != f2.E() || !f.e.getVersionID().equals(f2.e.getVersionID())) {
            return false;
        }
        String o = this.c.g().o().o();
        String o2 = com_dodopizza_persistence_entity_menu_productentityrealmproxy.c.g().o().o();
        if (o == null ? o2 != null : !o.equals(o2)) {
            return false;
        }
        if (this.c.g().E0() == com_dodopizza_persistence_entity_menu_productentityrealmproxy.c.g().E0()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i2;
        String path = this.c.f().getPath();
        String o = this.c.g().o().o();
        long E0 = this.c.g().E0();
        int i3 = 0;
        if (path != null) {
            i2 = path.hashCode();
        } else {
            i2 = 0;
        }
        int i4 = (527 + i2) * 31;
        if (o != null) {
            i3 = o.hashCode();
        }
        return ((i4 + i3) * 31) + ((int) ((E0 >>> 32) ^ E0));
    }

    @Override // com.dodopizza.persistence.entity.menu.ProductEntity, defpackage.vgc
    public String realmGet$allergens() {
        this.c.f().c();
        return this.c.g().p0(this.b.i);
    }

    @Override // com.dodopizza.persistence.entity.menu.ProductEntity, defpackage.vgc
    public String realmGet$allergensCanContain() {
        this.c.f().c();
        return this.c.g().p0(this.b.j);
    }

    @Override // com.dodopizza.persistence.entity.menu.ProductEntity, defpackage.vgc
    public String realmGet$category() {
        this.c.f().c();
        return this.c.g().p0(this.b.g);
    }

    @Override // com.dodopizza.persistence.entity.menu.ProductEntity, defpackage.vgc
    public k0<ComboTemplateSlotEntity> realmGet$comboTemplatesSlots() {
        this.c.f().c();
        k0<ComboTemplateSlotEntity> k0Var = this.g;
        if (k0Var != null) {
            return k0Var;
        }
        k0<ComboTemplateSlotEntity> k0Var2 = new k0<>(ComboTemplateSlotEntity.class, this.c.g().f0(this.b.A), this.c.f());
        this.g = k0Var2;
        return k0Var2;
    }

    @Override // com.dodopizza.persistence.entity.menu.ProductEntity, defpackage.vgc
    public k0<ProductEntity> realmGet$components() {
        this.c.f().c();
        k0<ProductEntity> k0Var = this.f;
        if (k0Var != null) {
            return k0Var;
        }
        k0<ProductEntity> k0Var2 = new k0<>(ProductEntity.class, this.c.g().f0(this.b.y), this.c.f());
        this.f = k0Var2;
        return k0Var2;
    }

    @Override // com.dodopizza.persistence.entity.menu.ProductEntity, defpackage.vgc
    public String realmGet$description() {
        this.c.f().c();
        return this.c.g().p0(this.b.h);
    }

    @Override // com.dodopizza.persistence.entity.menu.ProductEntity, defpackage.vgc
    public DoughTypeEntity realmGet$doughType() {
        this.c.f().c();
        if (this.c.g().o0(this.b.u)) {
            return null;
        }
        return (DoughTypeEntity) this.c.f().o(DoughTypeEntity.class, this.c.g().L(this.b.u), false, Collections.emptyList());
    }

    @Override // com.dodopizza.persistence.entity.menu.ProductEntity, defpackage.vgc
    public String realmGet$foodValueCarbohydrates() {
        this.c.f().c();
        return this.c.g().p0(this.b.q);
    }

    @Override // com.dodopizza.persistence.entity.menu.ProductEntity, defpackage.vgc
    public String realmGet$foodValueFats() {
        this.c.f().c();
        return this.c.g().p0(this.b.o);
    }

    @Override // com.dodopizza.persistence.entity.menu.ProductEntity, defpackage.vgc
    public String realmGet$foodValueKiloCalories() {
        this.c.f().c();
        return this.c.g().p0(this.b.r);
    }

    @Override // com.dodopizza.persistence.entity.menu.ProductEntity, defpackage.vgc
    public String realmGet$foodValueProteins() {
        this.c.f().c();
        return this.c.g().p0(this.b.p);
    }

    @Override // com.dodopizza.persistence.entity.menu.ProductEntity, defpackage.vgc
    public String realmGet$foodValueWeight() {
        this.c.f().c();
        return this.c.g().p0(this.b.s);
    }

    @Override // com.dodopizza.persistence.entity.menu.ProductEntity, defpackage.vgc
    public String realmGet$id() {
        this.c.f().c();
        return this.c.g().p0(this.b.e);
    }

    @Override // com.dodopizza.persistence.entity.menu.ProductEntity, defpackage.vgc
    public k0<ImageEntity> realmGet$images() {
        this.c.f().c();
        k0<ImageEntity> k0Var = this.e;
        if (k0Var != null) {
            return k0Var;
        }
        k0<ImageEntity> k0Var2 = new k0<>(ImageEntity.class, this.c.g().f0(this.b.l), this.c.f());
        this.e = k0Var2;
        return k0Var2;
    }

    @Override // com.dodopizza.persistence.entity.menu.ProductEntity, defpackage.vgc
    public k0<ProductIngredientEntity> realmGet$ingredients() {
        this.c.f().c();
        k0<ProductIngredientEntity> k0Var = this.d;
        if (k0Var != null) {
            return k0Var;
        }
        k0<ProductIngredientEntity> k0Var2 = new k0<>(ProductIngredientEntity.class, this.c.g().f0(this.b.k), this.c.f());
        this.d = k0Var2;
        return k0Var2;
    }

    @Override // com.dodopizza.persistence.entity.menu.ProductEntity, defpackage.vgc
    public String realmGet$metaProductId() {
        this.c.f().c();
        return this.c.g().p0(this.b.z);
    }

    @Override // com.dodopizza.persistence.entity.menu.ProductEntity, defpackage.vgc
    public String realmGet$name() {
        this.c.f().c();
        return this.c.g().p0(this.b.f);
    }

    @Override // com.dodopizza.persistence.entity.menu.ProductEntity, defpackage.vgc
    public String realmGet$portion() {
        this.c.f().c();
        return this.c.g().p0(this.b.w);
    }

    @Override // com.dodopizza.persistence.entity.menu.ProductEntity, defpackage.vgc
    public SizeGroupEntity realmGet$sizeGroup() {
        this.c.f().c();
        if (this.c.g().o0(this.b.v)) {
            return null;
        }
        return (SizeGroupEntity) this.c.f().o(SizeGroupEntity.class, this.c.g().L(this.b.v), false, Collections.emptyList());
    }

    @Override // com.dodopizza.persistence.entity.menu.ProductEntity, defpackage.vgc
    public String realmGet$sizeMeasure() {
        this.c.f().c();
        return this.c.g().p0(this.b.m);
    }

    @Override // com.dodopizza.persistence.entity.menu.ProductEntity, defpackage.vgc
    public String realmGet$sizeValue() {
        this.c.f().c();
        return this.c.g().p0(this.b.n);
    }

    @Override // com.dodopizza.persistence.entity.menu.ProductEntity, defpackage.vgc
    public k0<ToppingEntity> realmGet$toppings() {
        this.c.f().c();
        k0<ToppingEntity> k0Var = this.h;
        if (k0Var != null) {
            return k0Var;
        }
        k0<ToppingEntity> k0Var2 = new k0<>(ToppingEntity.class, this.c.g().f0(this.b.B), this.c.f());
        this.h = k0Var2;
        return k0Var2;
    }

    @Override // com.dodopizza.persistence.entity.menu.ProductEntity, defpackage.vgc
    public String realmGet$type() {
        this.c.f().c();
        return this.c.g().p0(this.b.t);
    }

    @Override // com.dodopizza.persistence.entity.menu.ProductEntity, defpackage.vgc
    public String realmGet$weight() {
        this.c.f().c();
        return this.c.g().p0(this.b.x);
    }

    @Override // com.dodopizza.persistence.entity.menu.ProductEntity, defpackage.vgc
    public void realmSet$allergens(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.i, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'allergens' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.i, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'allergens' to null.");
    }

    @Override // com.dodopizza.persistence.entity.menu.ProductEntity, defpackage.vgc
    public void realmSet$allergensCanContain(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.j, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'allergensCanContain' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.j, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'allergensCanContain' to null.");
    }

    @Override // com.dodopizza.persistence.entity.menu.ProductEntity, defpackage.vgc
    public void realmSet$category(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.g, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'category' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.g, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'category' to null.");
    }

    @Override // com.dodopizza.persistence.entity.menu.ProductEntity, defpackage.vgc
    public void realmSet$comboTemplatesSlots(k0<ComboTemplateSlotEntity> k0Var) {
        int i2 = 0;
        if (this.c.i()) {
            if (!this.c.d() || this.c.e().contains("comboTemplatesSlots")) {
                return;
            }
            if (k0Var != null && !k0Var.x()) {
                d0 d0Var = (d0) this.c.f();
                k0<ComboTemplateSlotEntity> k0Var2 = new k0<>();
                Iterator<ComboTemplateSlotEntity> it = k0Var.iterator();
                while (it.hasNext()) {
                    ComboTemplateSlotEntity next = it.next();
                    if (next != null && !n0.isManaged(next)) {
                        k0Var2.add((ComboTemplateSlotEntity) d0Var.j0(next, new ex4[0]));
                    } else {
                        k0Var2.add(next);
                    }
                }
                k0Var = k0Var2;
            }
        }
        this.c.f().c();
        OsList f0 = this.c.g().f0(this.b.A);
        if (k0Var != null && k0Var.size() == f0.X()) {
            int size = k0Var.size();
            while (i2 < size) {
                ComboTemplateSlotEntity comboTemplateSlotEntity = k0Var.get(i2);
                this.c.c(comboTemplateSlotEntity);
                f0.U(i2, ((r89) comboTemplateSlotEntity).a().g().E0());
                i2++;
            }
            return;
        }
        f0.J();
        if (k0Var == null) {
            return;
        }
        int size2 = k0Var.size();
        while (i2 < size2) {
            ComboTemplateSlotEntity comboTemplateSlotEntity2 = k0Var.get(i2);
            this.c.c(comboTemplateSlotEntity2);
            f0.k(((r89) comboTemplateSlotEntity2).a().g().E0());
            i2++;
        }
    }

    @Override // com.dodopizza.persistence.entity.menu.ProductEntity, defpackage.vgc
    public void realmSet$components(k0<ProductEntity> k0Var) {
        int i2 = 0;
        if (this.c.i()) {
            if (!this.c.d() || this.c.e().contains("components")) {
                return;
            }
            if (k0Var != null && !k0Var.x()) {
                d0 d0Var = (d0) this.c.f();
                k0<ProductEntity> k0Var2 = new k0<>();
                Iterator<ProductEntity> it = k0Var.iterator();
                while (it.hasNext()) {
                    ProductEntity next = it.next();
                    if (next != null && !n0.isManaged(next)) {
                        k0Var2.add((ProductEntity) d0Var.j0(next, new ex4[0]));
                    } else {
                        k0Var2.add(next);
                    }
                }
                k0Var = k0Var2;
            }
        }
        this.c.f().c();
        OsList f0 = this.c.g().f0(this.b.y);
        if (k0Var != null && k0Var.size() == f0.X()) {
            int size = k0Var.size();
            while (i2 < size) {
                ProductEntity productEntity = k0Var.get(i2);
                this.c.c(productEntity);
                f0.U(i2, ((r89) productEntity).a().g().E0());
                i2++;
            }
            return;
        }
        f0.J();
        if (k0Var == null) {
            return;
        }
        int size2 = k0Var.size();
        while (i2 < size2) {
            ProductEntity productEntity2 = k0Var.get(i2);
            this.c.c(productEntity2);
            f0.k(((r89) productEntity2).a().g().E0());
            i2++;
        }
    }

    @Override // com.dodopizza.persistence.entity.menu.ProductEntity, defpackage.vgc
    public void realmSet$description(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.h, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'description' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.h, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'description' to null.");
    }

    @Override // com.dodopizza.persistence.entity.menu.ProductEntity, defpackage.vgc
    public void realmSet$doughType(DoughTypeEntity doughTypeEntity) {
        d0 d0Var = (d0) this.c.f();
        if (this.c.i()) {
            if (!this.c.d() || this.c.e().contains("doughType")) {
                return;
            }
            if (doughTypeEntity != null && !n0.isManaged(doughTypeEntity)) {
                doughTypeEntity = (DoughTypeEntity) d0Var.j0(doughTypeEntity, new ex4[0]);
            }
            fp9 g = this.c.g();
            if (doughTypeEntity == null) {
                g.l0(this.b.u);
                return;
            }
            this.c.c(doughTypeEntity);
            g.o().B(this.b.u, g.E0(), ((r89) doughTypeEntity).a().g().E0(), true);
            return;
        }
        this.c.f().c();
        if (doughTypeEntity == null) {
            this.c.g().l0(this.b.u);
            return;
        }
        this.c.c(doughTypeEntity);
        this.c.g().s(this.b.u, ((r89) doughTypeEntity).a().g().E0());
    }

    @Override // com.dodopizza.persistence.entity.menu.ProductEntity, defpackage.vgc
    public void realmSet$foodValueCarbohydrates(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.q, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'foodValueCarbohydrates' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.q, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'foodValueCarbohydrates' to null.");
    }

    @Override // com.dodopizza.persistence.entity.menu.ProductEntity, defpackage.vgc
    public void realmSet$foodValueFats(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.o, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'foodValueFats' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.o, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'foodValueFats' to null.");
    }

    @Override // com.dodopizza.persistence.entity.menu.ProductEntity, defpackage.vgc
    public void realmSet$foodValueKiloCalories(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.r, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'foodValueKiloCalories' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.r, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'foodValueKiloCalories' to null.");
    }

    @Override // com.dodopizza.persistence.entity.menu.ProductEntity, defpackage.vgc
    public void realmSet$foodValueProteins(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.p, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'foodValueProteins' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.p, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'foodValueProteins' to null.");
    }

    @Override // com.dodopizza.persistence.entity.menu.ProductEntity, defpackage.vgc
    public void realmSet$foodValueWeight(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.s, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'foodValueWeight' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.s, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'foodValueWeight' to null.");
    }

    @Override // com.dodopizza.persistence.entity.menu.ProductEntity, defpackage.vgc
    public void realmSet$id(String str) {
        if (this.c.i()) {
            return;
        }
        this.c.f().c();
        throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override // com.dodopizza.persistence.entity.menu.ProductEntity, defpackage.vgc
    public void realmSet$images(k0<ImageEntity> k0Var) {
        int i2 = 0;
        if (this.c.i()) {
            if (!this.c.d() || this.c.e().contains("images")) {
                return;
            }
            if (k0Var != null && !k0Var.x()) {
                d0 d0Var = (d0) this.c.f();
                k0<ImageEntity> k0Var2 = new k0<>();
                Iterator<ImageEntity> it = k0Var.iterator();
                while (it.hasNext()) {
                    ImageEntity next = it.next();
                    if (next != null && !n0.isManaged(next)) {
                        k0Var2.add((ImageEntity) d0Var.f0(next, new ex4[0]));
                    } else {
                        k0Var2.add(next);
                    }
                }
                k0Var = k0Var2;
            }
        }
        this.c.f().c();
        OsList f0 = this.c.g().f0(this.b.l);
        if (k0Var != null && k0Var.size() == f0.X()) {
            int size = k0Var.size();
            while (i2 < size) {
                ImageEntity imageEntity = k0Var.get(i2);
                this.c.c(imageEntity);
                f0.U(i2, ((r89) imageEntity).a().g().E0());
                i2++;
            }
            return;
        }
        f0.J();
        if (k0Var == null) {
            return;
        }
        int size2 = k0Var.size();
        while (i2 < size2) {
            ImageEntity imageEntity2 = k0Var.get(i2);
            this.c.c(imageEntity2);
            f0.k(((r89) imageEntity2).a().g().E0());
            i2++;
        }
    }

    @Override // com.dodopizza.persistence.entity.menu.ProductEntity, defpackage.vgc
    public void realmSet$ingredients(k0<ProductIngredientEntity> k0Var) {
        int i2 = 0;
        if (this.c.i()) {
            if (!this.c.d() || this.c.e().contains("ingredients")) {
                return;
            }
            if (k0Var != null && !k0Var.x()) {
                d0 d0Var = (d0) this.c.f();
                k0<ProductIngredientEntity> k0Var2 = new k0<>();
                Iterator<ProductIngredientEntity> it = k0Var.iterator();
                while (it.hasNext()) {
                    ProductIngredientEntity next = it.next();
                    if (next != null && !n0.isManaged(next)) {
                        k0Var2.add((ProductIngredientEntity) d0Var.j0(next, new ex4[0]));
                    } else {
                        k0Var2.add(next);
                    }
                }
                k0Var = k0Var2;
            }
        }
        this.c.f().c();
        OsList f0 = this.c.g().f0(this.b.k);
        if (k0Var != null && k0Var.size() == f0.X()) {
            int size = k0Var.size();
            while (i2 < size) {
                ProductIngredientEntity productIngredientEntity = k0Var.get(i2);
                this.c.c(productIngredientEntity);
                f0.U(i2, ((r89) productIngredientEntity).a().g().E0());
                i2++;
            }
            return;
        }
        f0.J();
        if (k0Var == null) {
            return;
        }
        int size2 = k0Var.size();
        while (i2 < size2) {
            ProductIngredientEntity productIngredientEntity2 = k0Var.get(i2);
            this.c.c(productIngredientEntity2);
            f0.k(((r89) productIngredientEntity2).a().g().E0());
            i2++;
        }
    }

    @Override // com.dodopizza.persistence.entity.menu.ProductEntity, defpackage.vgc
    public void realmSet$metaProductId(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.z, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'metaProductId' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.z, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'metaProductId' to null.");
    }

    @Override // com.dodopizza.persistence.entity.menu.ProductEntity, defpackage.vgc
    public void realmSet$name(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.f, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'name' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.f, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'name' to null.");
    }

    @Override // com.dodopizza.persistence.entity.menu.ProductEntity, defpackage.vgc
    public void realmSet$portion(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.w, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'portion' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.w, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'portion' to null.");
    }

    @Override // com.dodopizza.persistence.entity.menu.ProductEntity, defpackage.vgc
    public void realmSet$sizeGroup(SizeGroupEntity sizeGroupEntity) {
        d0 d0Var = (d0) this.c.f();
        if (this.c.i()) {
            if (!this.c.d() || this.c.e().contains("sizeGroup")) {
                return;
            }
            if (sizeGroupEntity != null && !n0.isManaged(sizeGroupEntity)) {
                sizeGroupEntity = (SizeGroupEntity) d0Var.j0(sizeGroupEntity, new ex4[0]);
            }
            fp9 g = this.c.g();
            if (sizeGroupEntity == null) {
                g.l0(this.b.v);
                return;
            }
            this.c.c(sizeGroupEntity);
            g.o().B(this.b.v, g.E0(), ((r89) sizeGroupEntity).a().g().E0(), true);
            return;
        }
        this.c.f().c();
        if (sizeGroupEntity == null) {
            this.c.g().l0(this.b.v);
            return;
        }
        this.c.c(sizeGroupEntity);
        this.c.g().s(this.b.v, ((r89) sizeGroupEntity).a().g().E0());
    }

    @Override // com.dodopizza.persistence.entity.menu.ProductEntity, defpackage.vgc
    public void realmSet$sizeMeasure(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.m, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'sizeMeasure' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.m, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'sizeMeasure' to null.");
    }

    @Override // com.dodopizza.persistence.entity.menu.ProductEntity, defpackage.vgc
    public void realmSet$sizeValue(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.n, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'sizeValue' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.n, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'sizeValue' to null.");
    }

    @Override // com.dodopizza.persistence.entity.menu.ProductEntity, defpackage.vgc
    public void realmSet$toppings(k0<ToppingEntity> k0Var) {
        int i2 = 0;
        if (this.c.i()) {
            if (!this.c.d() || this.c.e().contains("toppings")) {
                return;
            }
            if (k0Var != null && !k0Var.x()) {
                d0 d0Var = (d0) this.c.f();
                k0<ToppingEntity> k0Var2 = new k0<>();
                Iterator<ToppingEntity> it = k0Var.iterator();
                while (it.hasNext()) {
                    ToppingEntity next = it.next();
                    if (next != null && !n0.isManaged(next)) {
                        k0Var2.add((ToppingEntity) d0Var.j0(next, new ex4[0]));
                    } else {
                        k0Var2.add(next);
                    }
                }
                k0Var = k0Var2;
            }
        }
        this.c.f().c();
        OsList f0 = this.c.g().f0(this.b.B);
        if (k0Var != null && k0Var.size() == f0.X()) {
            int size = k0Var.size();
            while (i2 < size) {
                ToppingEntity toppingEntity = k0Var.get(i2);
                this.c.c(toppingEntity);
                f0.U(i2, ((r89) toppingEntity).a().g().E0());
                i2++;
            }
            return;
        }
        f0.J();
        if (k0Var == null) {
            return;
        }
        int size2 = k0Var.size();
        while (i2 < size2) {
            ToppingEntity toppingEntity2 = k0Var.get(i2);
            this.c.c(toppingEntity2);
            f0.k(((r89) toppingEntity2).a().g().E0());
            i2++;
        }
    }

    @Override // com.dodopizza.persistence.entity.menu.ProductEntity, defpackage.vgc
    public void realmSet$type(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.t, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'type' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.t, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'type' to null.");
    }

    @Override // com.dodopizza.persistence.entity.menu.ProductEntity, defpackage.vgc
    public void realmSet$weight(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str != null) {
                g.o().E(this.b.x, g.E0(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'weight' to null.");
        }
        this.c.f().c();
        if (str != null) {
            this.c.g().i(this.b.x, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'weight' to null.");
    }

    public String toString() {
        String str;
        String str2;
        if (!n0.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("ProductEntity = proxy[");
        sb.append("{id:");
        String str3 = "null";
        if (realmGet$id() == null) {
            str = "null";
        } else {
            str = realmGet$id();
        }
        sb.append(str);
        sb.append("}");
        sb.append(",");
        sb.append("{name:");
        sb.append(realmGet$name());
        sb.append("}");
        sb.append(",");
        sb.append("{category:");
        sb.append(realmGet$category());
        sb.append("}");
        sb.append(",");
        sb.append("{description:");
        sb.append(realmGet$description());
        sb.append("}");
        sb.append(",");
        sb.append("{allergens:");
        sb.append(realmGet$allergens());
        sb.append("}");
        sb.append(",");
        sb.append("{allergensCanContain:");
        sb.append(realmGet$allergensCanContain());
        sb.append("}");
        sb.append(",");
        sb.append("{ingredients:");
        sb.append("RealmList<ProductIngredientEntity>[");
        sb.append(realmGet$ingredients().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{images:");
        sb.append("RealmList<ImageEntity>[");
        sb.append(realmGet$images().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{sizeMeasure:");
        sb.append(realmGet$sizeMeasure());
        sb.append("}");
        sb.append(",");
        sb.append("{sizeValue:");
        sb.append(realmGet$sizeValue());
        sb.append("}");
        sb.append(",");
        sb.append("{foodValueFats:");
        sb.append(realmGet$foodValueFats());
        sb.append("}");
        sb.append(",");
        sb.append("{foodValueProteins:");
        sb.append(realmGet$foodValueProteins());
        sb.append("}");
        sb.append(",");
        sb.append("{foodValueCarbohydrates:");
        sb.append(realmGet$foodValueCarbohydrates());
        sb.append("}");
        sb.append(",");
        sb.append("{foodValueKiloCalories:");
        sb.append(realmGet$foodValueKiloCalories());
        sb.append("}");
        sb.append(",");
        sb.append("{foodValueWeight:");
        sb.append(realmGet$foodValueWeight());
        sb.append("}");
        sb.append(",");
        sb.append("{type:");
        sb.append(realmGet$type());
        sb.append("}");
        sb.append(",");
        sb.append("{doughType:");
        if (realmGet$doughType() == null) {
            str2 = "null";
        } else {
            str2 = "DoughTypeEntity";
        }
        sb.append(str2);
        sb.append("}");
        sb.append(",");
        sb.append("{sizeGroup:");
        if (realmGet$sizeGroup() != null) {
            str3 = "SizeGroupEntity";
        }
        sb.append(str3);
        sb.append("}");
        sb.append(",");
        sb.append("{portion:");
        sb.append(realmGet$portion());
        sb.append("}");
        sb.append(",");
        sb.append("{weight:");
        sb.append(realmGet$weight());
        sb.append("}");
        sb.append(",");
        sb.append("{components:");
        sb.append("RealmList<ProductEntity>[");
        sb.append(realmGet$components().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{metaProductId:");
        sb.append(realmGet$metaProductId());
        sb.append("}");
        sb.append(",");
        sb.append("{comboTemplatesSlots:");
        sb.append("RealmList<ComboTemplateSlotEntity>[");
        sb.append(realmGet$comboTemplatesSlots().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{toppings:");
        sb.append("RealmList<ToppingEntity>[");
        sb.append(realmGet$toppings().size());
        sb.append("]");
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }
}
