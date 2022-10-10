package com.sto.sale.backstosale.service;

import com.sto.sale.backstosale.domain.Product;
import com.sto.sale.backstosale.dto.ProductDto;
import com.sto.sale.backstosale.repository.ProductRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class ProductService {
	private ProductRepository productRepository;
//	private SaleRepository saleRepository;

	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	/**
	 * 모든 상품 목록 조회
	 */
	public List<Product> findAllProducts() {
		return productRepository.findAll();
	}

//    /**
//     * 판매 상품 목록 조회
//     */
//    public List<Product> findOnSaleProducts() {
//        return productRepository.findByOnSaleProducts();
//    }

	/**
	 * 판매 상품 목록 조회 (Product join Sale)
	 */
	public List<ProductDto> findOnSaleProducts(Integer page, Integer size) {
		Pageable pageable = PageRequest.of(page, size);
		return productRepository.findByOnSaleProducts(pageable);
	}

	/**
	 * 판매 상품 목록의 판매 상품 총 개수
	 */

	public Long findOnSaleProductsCnt() {
		Pageable pageable = PageRequest.of(0, 5);
		Page<Product> productPage = productRepository.findByOnSaleProductsCnt(pageable);
		Long totalCnt = productPage.getTotalElements();
		return totalCnt;
	}

	/**
	 * 판매 상품 한 건 조회 (구매 상세페이지)
	 */
	public ProductDto findProductId(Long id) {
		return productRepository.findByProductId(id);
//        return productRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("ID를 확인해주세요"));
		// findById시 에러가 발생할 수 있기에 람다식으로 에러 처리
	}


}
