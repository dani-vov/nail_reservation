package NailShop.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "work", url = "http://localhost:8082")
public interface NailService {

    @RequestMapping(method = RequestMethod.POST, path = "/nails")
    public void work(@RequestBody Nail nail);
}
