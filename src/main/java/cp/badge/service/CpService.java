package cp.badge.service;

import cp.badge.client.ShieldsClient;
import cp.badge.flatform.FlatForm;

import java.util.Optional;

public abstract class CpService {
    protected final ShieldsClient shieldsClient;
    public CpService(ShieldsClient shieldsClient){this.shieldsClient = shieldsClient;}
    protected abstract Optional<byte[]> getUserInfo(String handle);

    protected String buildUrl(FlatForm flatForm){
        return flatForm.getName()
                +"-"
                +flatForm.getRating()
                +"-"
                +flatForm.getColor();
    }

}
