def get_options(opts){

  def options = [:]

  def option_names = [
    'notify_per_env'
  ]

  def option_defaults = [
    'notify_per_env': null
  ]

  // Getting module options and setting defaults
  def i=0
  for (i=0; i < option_names.size(); i++) {
    name = option_names[i]
    value = (opts!=null && opts[name] != null) ? opts[name] : option_defaults[name]
    options.put (name, value)
  }

  return options
}

def main() {
  options = get_options(module_opts)
}

return this;
