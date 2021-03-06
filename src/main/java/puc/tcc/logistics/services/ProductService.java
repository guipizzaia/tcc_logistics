package puc.tcc.logistics.services;

import javassist.NotFoundException;
import org.springframework.core.io.Resource;
import org.springframework.data.domain.Page;
import puc.tcc.logistics.exception.LogisticsException;
import puc.tcc.logistics.persistence.domain.ProductEntity;
import puc.tcc.logistics.resources.product.ProductRequest;
import puc.tcc.logistics.resources.product.ProductResponse;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

public interface ProductService {

    ProductResponse saveOrUpdate(final ProductRequest productRequest) throws LogisticsException;

    Page<ProductEntity> findAll(int page, int size);

    Optional<ProductResponse> findById(final Long id);

    List<ProductResponse> findAll();

    void delete(final Long id) throws LogisticsException;

    void upload(Long id, byte[] file, String filename) throws IOException, NotFoundException, LogisticsException;

    Resource download(Long id) throws NotFoundException, MalformedURLException, LogisticsException, URISyntaxException;
}
