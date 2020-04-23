package nailshop.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Service
@FeignClient(name = "work", url = "${api.url.work}")
public interface NailService {

    @RequestMapping(method = RequestMethod.POST, path = "/nails")
    public void work(@RequestBody Nail nail);
}
