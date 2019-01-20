package com.salesmanager.shop.store.controller.store.facade;

import javax.servlet.http.HttpServletRequest;
import com.salesmanager.core.model.content.InputContentFile;
import com.salesmanager.core.model.merchant.MerchantStore;
import com.salesmanager.core.model.merchant.MerchantStoreCriteria;
import com.salesmanager.core.model.reference.language.Language;
import com.salesmanager.shop.model.shop.PersistableMerchantStore;
import com.salesmanager.shop.model.shop.ReadableBrand;
import com.salesmanager.shop.model.shop.ReadableMerchantStore;
import com.salesmanager.shop.model.shop.ReadableMerchantStoreList;

/**
 * Layer between shop controllers, services and API with sm-core
 * 
 * @author carlsamson
 *
 */
public interface StoreFacade {

  /**
   * Find MerchantStore model from store code
   * 
   * @param code
   * @return
   * @throws Exception
   */
  MerchantStore getByCode(HttpServletRequest request);

  MerchantStore get(String code);
  
  MerchantStore getByCode(String code);

  ReadableMerchantStore getByCode(String code, Language lang);

  /**
   * List MerchantStore using various criterias
   * 
   * @param criteria
   * @param lang
   * @return
   * @throws Exception
   */
  ReadableMerchantStoreList getByCriteria(MerchantStoreCriteria criteria, Language lang)
      throws Exception;

  /**
   * Creates a brand new MerchantStore
   * 
   * @param store
   * @throws Exception
   */
  void create(PersistableMerchantStore store) throws Exception;

  /**
   * Updates an existing store
   * 
   * @param store
   * @throws Exception
   */
  void update(PersistableMerchantStore store) throws Exception;

  /**
   * Deletes a MerchantStore based on store code
   * 
   * @param code
   */
  void delete(String code);
  
  /**
   * Get Logo, social networks and other brand configurations
   * @param code
   * @return
   */
  ReadableBrand getBrand(String code);
  
  /**
   * Delete store logo
   */
  void deleteLogo(String code);
  
  /**
   * Add MerchantStore logo
   * @param code
   * @param cmsContentImage
   */
  void addStoreLogo(String code, InputContentFile cmsContentImage) throws Exception;

}
