package cat.yoink.dream.api.setting;

import cat.yoink.dream.api.module.Module;

import java.util.ArrayList;

public class SettingManager
{
	private final ArrayList<Setting> settings = new ArrayList<>();

	public void addSetting(Setting setting)
	{
		settings.add(setting);
	}

	public ArrayList<Setting> getSettings(Module module)
	{
		ArrayList<Setting> sets = new ArrayList<>();

		for (Setting setting : settings)
		{
			if (setting.getModule().equals(module))
			{
				sets.add(setting);
			}
		}

		return sets;
	}

	public Setting getSetting(Module module, String name)
	{
		for (Setting setting : settings)
		{
			if (setting.getModule().equals(module) && setting.getName().equalsIgnoreCase(name))
			{
				return setting;
			}
		}

		return null;
	}
}
