package vn.com.sky.sys.menu;

import java.util.ArrayList;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Transient;
import org.springframework.data.relational.core.mapping.Table;

import vn.com.sky.sys.model.Menu;

@EqualsAndHashCode(callSuper = false)
@Data
@Table("menu")
public class MenuReq extends Menu {
    @Transient
    private ArrayList<Long> insertDepIds;

    @Transient
    private ArrayList<Long> deleteDepIds;
}
