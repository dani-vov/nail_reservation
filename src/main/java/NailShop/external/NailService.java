package NailShop.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "work", url = "http://work:8080")
public interface NailService {

    @RequestMapping(method = RequestMethod.POST, path = "/nails")
    public void work(@RequestBody Nail nail);
}
